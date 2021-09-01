/**
 * <copyright>
 * 
 * Copyright (c) 2014 itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     itemis - Initial API and implementation
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.internal;

/**
 * This class helps: counting UUID usage & reducing UUID memory footprint
 */
public class UUID {
	/**
	 * This map will map any UUID to its unique instance.
	 */
	private static final int ECUC_VERSION = 5;
	private static final int DCE_VERSION = 6;

	private Object data;
	private int useCount = 0; // usage reference

	public Object getData() {
		return data;
	}

	public synchronized void incrUseCount() {
		++useCount;
	}

	public synchronized void decrUseCount() {
		--useCount;
	}

	public int getUseCount() {
		return useCount;
	}

	// never returns null
	public UUID(Object o) {
		if (o == null) {
			return;
		}
		if (o instanceof String) {
			init((String) o);
		} else if (o instanceof java.util.UUID) {
			java.util.UUID t = (java.util.UUID) o;
			init(t.getMostSignificantBits(), t.getLeastSignificantBits());
		} else if (o instanceof long[]) {
			long[] t = (long[]) o;
			if (t.length == 2) {
				init(t[0], t[1]);
			}
		}
		if (data == null) {
			throw new IllegalArgumentException();
		}
	}

	private void init(String s) {
		data = s; // default is string
		// try to reduce mem usage if we can
		try {
			int version = 0;
			if (s.startsWith("DCE:")) { //$NON-NLS-1$
				version = DCE_VERSION;
				s = s.substring(4);
			}
			if (s.startsWith("ECUC:")) { //$NON-NLS-1$
				version = ECUC_VERSION;
				s = s.substring(5);
			}
			if (version != 0) {
				java.util.UUID uid = java.util.UUID.fromString(s);
				long[] tab = new long[] { uid.getMostSignificantBits(), uid.getLeastSignificantBits() };
				// change version
				tab[0] &= ~0xF000;
				tab[0] |= version << 12;
				data = tab;
			} else {
				if (s.length() > 0) {
					java.util.UUID uid = java.util.UUID.fromString(s);
					long[] tab = new long[] { uid.getMostSignificantBits(), uid.getLeastSignificantBits() };
					data = tab;
				}
			}
		} catch (Exception e) {
			// ignore
		}
	}

	private void init(long msb, long lsb) {
		data = new long[] { msb, lsb };
	}

	@Override
	public String toString() {
		if (data == null || data instanceof String) {
			return (String) data;
		} else {
			long[] tab = (long[]) data;
			java.util.UUID uid = new java.util.UUID(tab[0], tab[1]);
			return (uid.version() == DCE_VERSION ? "DCE:" : uid.version() == ECUC_VERSION ? "ECUC:" : "") + uid.toString(); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		}
	}

	@Override
	public int hashCode() {
		if (hashCode != 0) {
			return hashCode;
		}
		String s = toString();
		return s == null ? 0 : (hashCode = s.hashCode());
	}

	private int hashCode = 0;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UUID) {
			UUID other = (UUID) obj;
			if (data instanceof long[] && other.data instanceof long[]) {
				long[] tab1 = (long[]) data;
				long[] tab2 = (long[]) other.data;
				return tab1[0] == tab2[0] && tab1[1] == tab2[1];
			}
			String s1 = toString();
			String s2 = obj.toString();
			return s1 == null ? s2 == null : s1.equals(s2);
		}
		return false;
	}
}
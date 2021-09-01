/**
 * <copyright>
 * 
 * Copyright (c) 2014 itemis, Arccore and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *     itemis - Initial API and implementation
 *     Arccore - Explorer actions and common source code
 * 
 * </copyright>
 */
package org.eclipse.eatop.common.datatypes;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.common.util.DelegatingEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * 
 */
public abstract class ToPrimitiveEList<P, T extends AbstractNumericalDatatype> extends DelegatingEList<P> implements InternalEList.Unsettable<P>,
		INumericalDataTypeEList<P, T> {

	private final EList<T> delegation;

	private static final long serialVersionUID = 1L;

	/**
	 * @param <P>
	 */
	@SuppressWarnings("hiding")
	protected class EIterator<P> extends AbstractEList<P>.EIterator<P> {

	}

	/**
	 * @param <P>
	 */
	@SuppressWarnings("hiding")
	protected class EListIterator<P> extends AbstractEList<P>.EListIterator<P> {

	}

	/**
	 * @param delegation
	 */
	public ToPrimitiveEList(EList<T> delegation) {
		this.delegation = delegation;
	}

	/**
	 * @return
	 */
	public EList<T> getDelegationList() {
		return delegation;
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateList()
	 */
	@Override
	protected List<P> delegateList() {
		return this;
	}

	/**
	 * @param value
	 * @return
	 */
	public abstract T newDelegationElement(P value);

	/**
	 * @param value
	 * @return
	 */
	public abstract T newDelegationElement(String value);

	/**
	 * @return
	 */
	protected abstract Class<P> getDataClass();

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateSize()
	 */
	@Override
	protected int delegateSize() {
		return delegation.size();
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateIsEmpty()
	 */
	@Override
	protected boolean delegateIsEmpty() {
		return delegation.isEmpty();
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateContains(java.lang.Object)
	 */
	@Override
	protected boolean delegateContains(Object object) {
		for (T t : delegation) {
			if (t.basicGetValue().equals(object)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateContainsAll(java.util.Collection)
	 */
	@Override
	protected boolean delegateContainsAll(Collection<?> collection) {
		for (Object obj : collection) {
			if (!delegateContains(obj)) {
				return false;
			}
		}
		return true;
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateIndexOf(java.lang.Object)
	 */
	@Override
	protected int delegateIndexOf(Object object) {
		for (int i = 0; i < delegation.size(); i++) {
			T t = delegation.get(i);
			if (t.basicGetValue().equals(object)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateLastIndexOf(java.lang.Object)
	 */
	@Override
	protected int delegateLastIndexOf(Object object) {
		for (int i = delegation.size() - 1; i > -1; i--) {
			T t = delegation.get(i);
			if (t.basicGetValue().equals(object)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateToArray()
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected Object[] delegateToArray() {
		return delegateToArray((P[]) Array.newInstance(getDataClass(), delegation.size()));
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateToArray(T[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected <R> R[] delegateToArray(R[] array) {
		if (array.length < delegation.size()) {
			array = (R[]) Array.newInstance(getDataClass(), delegation.size());
		}
		for (int i = 0; i < delegation.size(); i++) {
			array[i] = (R) delegation.get(i).basicGetValue();
		}
		return array;
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateGet(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected P delegateGet(int index) {
		return (P) delegation.get(index).basicGetValue();
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateSet(int, java.lang.Object)
	 */
	@Override
	protected P delegateSet(int index, P object) {
		T t = delegation.get(index);
		@SuppressWarnings("unchecked")
		P result = (P) t.basicGetValue();
		t.basicSetValue(object);
		delegation.set(index, t);
		return result;
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateAdd(java.lang.Object)
	 */
	@Override
	protected void delegateAdd(P object) {
		T element = newDelegationElement(object);
		delegation.add(element);
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateAdd(int, java.lang.Object)
	 */
	@Override
	protected void delegateAdd(int index, P object) {
		T element = newDelegationElement(object);
		delegation.add(index, element);
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateRemove(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected P delegateRemove(int index) {

		T remove = delegation.remove(index);
		return (P) remove.basicGetValue();
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateClear()
	 */
	@Override
	protected void delegateClear() {
		delegation.clear();
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateMove(int, int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected P delegateMove(int targetIndex, int sourceIndex) {
		T move = delegation.move(targetIndex, sourceIndex);
		return (P) move.basicGetValue();
	}

	@Override
	protected boolean delegateEquals(Object object) {
		if (object instanceof List<?>) {
			List<?> otherList = (List<?>) object;
			int thisSize = size();
			if (otherList.size() != thisSize) {
				return false;
			}
			for (int i = 0; i < thisSize; i++) {
				if (!get(i).equals(otherList.get(i))) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateHashCode()
	 */
	@Override
	protected int delegateHashCode() {
		int hashCode = 1;
		for (int i = 0, size = size(); i < size; ++i) {
			Object object = primitiveGet(i);
			hashCode = 31 * hashCode + (object == null ? 0 : object.hashCode());
		}
		return hashCode;
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateToString()
	 */
	@Override
	protected String delegateToString() {
		return delegation.toString();
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateIterator()
	 */
	@Override
	protected Iterator<P> delegateIterator() {
		return new EIterator<P>();
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateListIterator()
	 */
	@Override
	protected ListIterator<P> delegateListIterator() {
		return new EListIterator<P>();
	}

	/*
	 * @see org.eclipse.emf.common.util.DelegatingEList#delegateBasicList()
	 */
	@Override
	protected List<P> delegateBasicList() {
		return this;
	}

	@Override
	public List<P> basicList() {
		return this;
	}

	@Override
	public Iterator<P> basicIterator() {
		return super.basicIterator();
	}

	@Override
	public P basicGet(int index) {
		// TODO Auto-generated method stub
		return super.basicGet(index);
	}

	@Override
	public ListIterator<P> basicListIterator() {
		return super.basicListIterator();
	}

	@Override
	public ListIterator<P> basicListIterator(int index) {
		return super.basicListIterator(index);
	}

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicToArray()
	 */
	@Override
	public Object[] basicToArray() {
		return delegateToArray();
	}

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicToArray(T[])
	 */
	@Override
	public <R> R[] basicToArray(R[] array) {
		return delegateToArray(array);
	};

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicContainsAll(java.util.Collection)
	 */
	@Override
	public boolean basicContainsAll(Collection<?> collection) {
		return containsAll(collection);
	}

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicLastIndexOf(java.lang.Object)
	 */
	@Override
	public int basicLastIndexOf(Object object) {
		return lastIndexOf(object);
	}

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicRemove(java.lang.Object,
	 * org.eclipse.emf.common.notify.NotificationChain)
	 */
	@Override
	public NotificationChain basicRemove(Object object, NotificationChain notifications) {
		remove(object);
		return notifications;
	}

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicAdd(java.lang.Object,
	 * org.eclipse.emf.common.notify.NotificationChain)
	 */
	@Override
	public NotificationChain basicAdd(P object, NotificationChain notifications) {
		add(object);
		return notifications;
	};

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicIndexOf(java.lang.Object)
	 */
	@Override
	public int basicIndexOf(Object object) {
		return indexOf(object);
	}

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList#basicContains(java.lang.Object)
	 */
	@Override
	public boolean basicContains(Object object) {
		return contains(object);
	}

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList.Unsettable#unset()
	 */
	@Override
	public void unset() {
		clear();
	}

	/*
	 * @see org.eclipse.emf.ecore.util.InternalEList.Unsettable#isSet()
	 */
	@Override
	public boolean isSet() {
		return !isEmpty();
	}

	/*
	 * @see org.artop.aal.common.datatypes.INumericalDataTypeEList#getNumericalData(int)
	 */
	@Override
	public T getNumericalData(int index) {
		@SuppressWarnings("unchecked")
		T clone = (T) getDelegationList().get(index).clone();
		return clone;
	}

	/*
	 * @see org.artop.aal.common.datatypes.INumericalDataTypeEList#setNumericalData(int,
	 * org.artop.aal.common.datatypes.INumericalDataType)
	 */
	@Override
	public void setNumericalData(int index, T data) {
		T existingData = getDelegationList().get(index);
		existingData.setRadix(data.getRadix());
		existingData.setNoOfDigits(existingData.getNoOfDigits());
		getDelegationList().set(index, existingData);
	};

}
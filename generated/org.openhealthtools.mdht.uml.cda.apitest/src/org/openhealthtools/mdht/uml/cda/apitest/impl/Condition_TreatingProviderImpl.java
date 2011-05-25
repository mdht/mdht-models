/*******************************************************************************
 * Copyright (c) 2011 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.apitest.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.Condition_TreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.operations.Condition_TreatingProviderOperations;
import org.openhealthtools.mdht.uml.cda.impl.AssignedEntityImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Treating Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Condition_TreatingProviderImpl extends AssignedEntityImpl implements Condition_TreatingProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Condition_TreatingProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APITestPackage.Literals.CONDITION_TREATING_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedEntity toCDAType() {
		return Condition_TreatingProviderOperations.toCDAType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getTreatingProviderIDs() {
		return Condition_TreatingProviderOperations.getTreatingProviderIDs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II addTreatingProviderID() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		II value = (II) eObject;
		getIds().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITreatingProvider addTreatingProviderID(II value) {
		return Condition_TreatingProviderOperations.addTreatingProviderID(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTreatingProviderId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return Condition_TreatingProviderOperations.validateTreatingProviderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition_TreatingProvider init() {
		CDAUtil.init(this);
		return this;
	}
} // Condition_TreatingProviderImpl

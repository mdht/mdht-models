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
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.domain.IHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.apitest.operations.HealthStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Status Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HealthStatusObservationImpl extends StatusObservationImpl implements HealthStatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthStatusObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APITestPackage.Literals.HEALTH_STATUS_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IHealthStatusObservation withValue(CE value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		eFactory.create(eClass);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observation toCDAType() {
		return HealthStatusObservationOperations.toCDAType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CE getValue() {
		return HealthStatusObservationOperations.getValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CE withValue() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CE value = (CE) eObject;
		getValues().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthStatusObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateHealthStatusObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStatusObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateStatusObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateStatusObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HealthStatusObservationOperations.validateStatusObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthStatusObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // HealthStatusObservationImpl

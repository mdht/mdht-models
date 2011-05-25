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
import org.openhealthtools.mdht.uml.cda.apitest.Severity;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ISeverity;
import org.openhealthtools.mdht.uml.cda.apitest.operations.SeverityOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Severity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SeverityImpl extends ObservationImpl implements Severity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeverityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APITestPackage.Literals.SEVERITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation toCDAType() {
		return SeverityOperations.toCDAType(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED withText() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ED value = (ED) eObject;
		setText(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity withText(ED value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
		eFactory.create(eClass);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getValue() {
		return SeverityOperations.getValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD withValue() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CD value = (CD) eObject;
		getValues().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverity withValue(CD value) {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		eFactory.create(eClass);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityHasTextReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityOperations.validateSeverityHasTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityOperations.validateSeverityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityOperations.validateSeverityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityOperations.validateSeverityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityOperations.validateSeverityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityOperations.validateSeverityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityOperations.validateSeverityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SeverityOperations.validateSeverityValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity init() {
		CDAUtil.init(this);
		return this;
	}
} // SeverityImpl

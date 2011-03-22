/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.toc.Severity;
import org.openhealthtools.mdht.uml.cda.toc.TOCPackage;

import org.openhealthtools.mdht.uml.cda.toc.operations.SeverityOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

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
		return TOCPackage.Literals.SEVERITY;
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
} //SeverityImpl

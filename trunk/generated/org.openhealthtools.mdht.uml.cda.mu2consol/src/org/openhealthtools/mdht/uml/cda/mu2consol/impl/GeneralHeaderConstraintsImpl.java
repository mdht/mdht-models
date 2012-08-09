/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;

import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>General Header Constraints</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class GeneralHeaderConstraintsImpl extends ClinicalDocumentImpl
		implements GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GeneralHeaderConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.GENERAL_HEADER_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations
				.validateGeneralHeaderConstraintsTemplateId(this, diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTarget(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations
				.validateGeneralHeaderConstraintsRecordTarget(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations
				.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations
				.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraintsRecordTargetPatientRole(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return GeneralHeaderConstraintsOperations
				.validateGeneralHeaderConstraintsRecordTargetPatientRole(this,
						diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GeneralHeaderConstraints init() {
		CDAUtil.init(this);
		return this;
	}
} // GeneralHeaderConstraintsImpl

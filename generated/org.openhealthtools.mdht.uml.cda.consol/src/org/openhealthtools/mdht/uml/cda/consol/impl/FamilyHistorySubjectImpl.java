/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySubject;

import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistorySubjectOperations;

import org.openhealthtools.mdht.uml.cda.impl.SubjectImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistorySubjectImpl extends SubjectImpl implements FamilyHistorySubject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistorySubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FAMILY_HISTORY_SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySubjectRelatedSubjectClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySubjectRelatedSubjectCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySubjectRelatedSubjectCodeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectCodeValueSet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySubjectRelatedSubjectSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistorySubjectOperations.validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySubject init() {
		CDAUtil.init(this);
		return this;
	}
} // FamilyHistorySubjectImpl

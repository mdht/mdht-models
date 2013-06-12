/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfCondition;
import org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfCondition;
import org.openhealthtools.mdht.uml.cda.emspcr.HistoryOfProceduresOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.PastMedicalHistorySection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PastMedicalHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Past Medical History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PastMedicalHistorySectionImpl extends SectionImpl implements PastMedicalHistorySection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PastMedicalHistorySectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PAST_MEDICAL_HISTORY_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePastMedicalHistorySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePastMedicalHistorySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePastMedicalHistorySectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePastMedicalHistorySectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePastMedicalHistorySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePastMedicalHistorySectionExistenceOfHistoryOfCondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionExistenceOfHistoryOfCondition(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePastMedicalHistorySectionHistoryOfCondition(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionHistoryOfCondition(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validatePastMedicalHistorySectionHistoryOfProceduresOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PastMedicalHistorySectionOperations.validatePastMedicalHistorySectionHistoryOfProceduresOrganizer(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ExistenceOfHistoryOfCondition getExistenceOfHistoryOfCondition() {
		return PastMedicalHistorySectionOperations.getExistenceOfHistoryOfCondition(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public HistoryOfCondition getHistoryOfCondition() {
		return PastMedicalHistorySectionOperations.getHistoryOfCondition(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public HistoryOfProceduresOrganizer getHistoryOfProceduresOrganizer() {
		return PastMedicalHistorySectionOperations.getHistoryOfProceduresOrganizer(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public PastMedicalHistorySection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PastMedicalHistorySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PastMedicalHistorySectionImpl

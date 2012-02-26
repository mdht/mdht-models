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
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.PreoperativeDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preoperative Diagnosis Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PreoperativeDiagnosisSectionImpl extends SectionImpl implements PreoperativeDiagnosisSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreoperativeDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PREOPERATIVE_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreoperativeDiagnosisSectionPreoperativeDiagnosis(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreoperativeDiagnosisSectionOperations.validatePreoperativeDiagnosisSectionPreoperativeDiagnosis(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosis getPreoperativeDiagnosis() {
		return PreoperativeDiagnosisSectionOperations.getPreoperativeDiagnosis(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreoperativeDiagnosisSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} // PreoperativeDiagnosisSectionImpl

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
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct;

import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Diagnosis Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeDiagnosisSectionImpl extends SectionImpl implements DischargeDiagnosisSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeDiagnosisSectionOperations.validateDischargeDiagnosisSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeDiagnosisSectionOperations.validateDischargeDiagnosisSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeDiagnosisSectionCondition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeDiagnosisSectionOperations.validateDischargeDiagnosisSectionCondition(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemConcernAct getCondition() {
		return DischargeDiagnosisSectionOperations.getCondition(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiagnosisSection init() {
		CDAUtil.init(this);
		return this;
	}
} // DischargeDiagnosisSectionImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CodedFamilyMedicalHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coded Family Medical History Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CodedFamilyMedicalHistorySectionImpl extends FamilyMedicalHistorySectionImpl implements
		CodedFamilyMedicalHistorySection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedFamilyMedicalHistorySectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.CODED_FAMILY_MEDICAL_HISTORY_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedFamilyMedicalHistorySectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CodedFamilyMedicalHistorySectionOperations.validateCodedFamilyMedicalHistorySectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CodedFamilyMedicalHistorySectionOperations.validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryOrganizer getIHEFamilyHistoryOrganizer() {
		return CodedFamilyMedicalHistorySectionOperations.getIHEFamilyHistoryOrganizer(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodedFamilyMedicalHistorySection init() {
		CDAUtil.init(this);
		return this;
	}
} // CodedFamilyMedicalHistorySectionImpl

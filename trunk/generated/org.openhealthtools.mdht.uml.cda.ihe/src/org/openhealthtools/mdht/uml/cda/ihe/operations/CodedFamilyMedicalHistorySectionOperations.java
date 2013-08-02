/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coded Family Medical History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection#validateCodedFamilyMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Family Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection#validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Family Medical History Section Family History Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CodedFamilyMedicalHistorySection#getIHEFamilyHistoryOrganizer() <em>Get IHE Family History Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodedFamilyMedicalHistorySectionOperations extends FamilyMedicalHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodedFamilyMedicalHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedFamilyMedicalHistorySectionTemplateId(CodedFamilyMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Family Medical History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedFamilyMedicalHistorySectionTemplateId(CodedFamilyMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.15')";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedFamilyMedicalHistorySectionTemplateId(CodedFamilyMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Family Medical History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedFamilyMedicalHistorySectionTemplateId(CodedFamilyMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedFamilyMedicalHistorySection The receiving '<em><b>Coded Family Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedFamilyMedicalHistorySectionTemplateId(
			CodedFamilyMedicalHistorySection codedFamilyMedicalHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_FAMILY_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedFamilyMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_FAMILY_MEDICAL_HISTORY_SECTION__CODED_FAMILY_MEDICAL_HISTORY_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("CodedFamilyMedicalHistorySectionTemplateId"),
					new Object[] { codedFamilyMedicalHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(CodedFamilyMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Family Medical History Section Family History Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(CodedFamilyMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(ihe::FamilyHistoryOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(CodedFamilyMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coded Family Medical History Section Family History Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(CodedFamilyMedicalHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param codedFamilyMedicalHistorySection The receiving '<em><b>Coded Family Medical History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateCodedFamilyMedicalHistorySectionFamilyHistoryOrganizer(
			CodedFamilyMedicalHistorySection codedFamilyMedicalHistorySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.CODED_FAMILY_MEDICAL_HISTORY_SECTION);
			try {
				VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CODED_FAMILY_MEDICAL_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			codedFamilyMedicalHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.CODED_FAMILY_MEDICAL_HISTORY_SECTION__CODED_FAMILY_MEDICAL_HISTORY_SECTION_FAMILY_HISTORY_ORGANIZER,
					IHEPlugin.INSTANCE.getString("CodedFamilyMedicalHistorySectionFamilyHistoryOrganizer"),
					new Object[] { codedFamilyMedicalHistorySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIHEFamilyHistoryOrganizer(CodedFamilyMedicalHistorySection) <em>Get IHE Family History Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHEFamilyHistoryOrganizer(CodedFamilyMedicalHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IHE_FAMILY_HISTORY_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(ihe::FamilyHistoryOrganizer))->asSequence()->any(true).oclAsType(ihe::FamilyHistoryOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getIHEFamilyHistoryOrganizer(CodedFamilyMedicalHistorySection) <em>Get IHE Family History Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHEFamilyHistoryOrganizer(CodedFamilyMedicalHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IHE_FAMILY_HISTORY_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FamilyHistoryOrganizer getIHEFamilyHistoryOrganizer(
			CodedFamilyMedicalHistorySection codedFamilyMedicalHistorySection) {
		if (GET_IHE_FAMILY_HISTORY_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.CODED_FAMILY_MEDICAL_HISTORY_SECTION,
				IHEPackage.Literals.CODED_FAMILY_MEDICAL_HISTORY_SECTION.getEAllOperations().get(66));
			try {
				GET_IHE_FAMILY_HISTORY_ORGANIZER__EOCL_QRY = helper.createQuery(GET_IHE_FAMILY_HISTORY_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IHE_FAMILY_HISTORY_ORGANIZER__EOCL_QRY);
		return (FamilyHistoryOrganizer) query.evaluate(codedFamilyMedicalHistorySection);
	}

} // CodedFamilyMedicalHistorySectionOperations

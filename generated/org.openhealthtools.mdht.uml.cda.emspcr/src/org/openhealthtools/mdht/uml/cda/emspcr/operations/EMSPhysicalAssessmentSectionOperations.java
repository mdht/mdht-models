/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientAge;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Physical Assessment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Physical Assessment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionPatientPregnancy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Patient Pregnancy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionLastOralIntake(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Last Oral Intake</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionPatientAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Patient Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionThrombolyticContraindications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Thrombolytic Contraindications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionBarriersToPatientCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Barriers To Patient Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getPhysicalAssessmentOrganizer() <em>Get Physical Assessment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getPatientPregnancy() <em>Get Patient Pregnancy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getLastOralIntake() <em>Get Last Oral Intake</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getPatientAge() <em>Get Patient Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getThrombolyticContraindications() <em>Get Thrombolytic Contraindications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getBarriersToPatientCare() <em>Get Barriers To Patient Care</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSPhysicalAssessmentSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSPhysicalAssessmentSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionTemplateId(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionTemplateId(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionTemplateId"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '29545-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionCode(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionCode(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionCode"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionCodeP(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionCodeP(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionCodeP"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Physical Assessment Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionTitle(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionTitle(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionTitle"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionText(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionText(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionText"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Physical Assessment Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::PhysicalAssessmentOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Physical Assessment Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionPatientPregnancy(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Patient Pregnancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionPatientPregnancy(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientPregnancy) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionPatientPregnancy(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Patient Pregnancy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionPatientPregnancy(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionPatientPregnancy(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionPatientPregnancy"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionLastOralIntake(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Last Oral Intake</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionLastOralIntake(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::LastOralIntake) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionLastOralIntake(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Last Oral Intake</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionLastOralIntake(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionLastOralIntake(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionLastOralIntake"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionPatientAge(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Patient Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionPatientAge(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientAge) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionPatientAge(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Patient Age</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionPatientAge(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionPatientAge(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionPatientAge"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionThrombolyticContraindications(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Thrombolytic Contraindications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionThrombolyticContraindications(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ThrombolyticContraindications) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionThrombolyticContraindications(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Thrombolytic Contraindications</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionThrombolyticContraindications(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionThrombolyticContraindications(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionThrombolyticContraindications"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSPhysicalAssessmentSectionBarriersToPatientCare(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Barriers To Patient Care</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionBarriersToPatientCare(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::BarriersToPatientCare) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSPhysicalAssessmentSectionBarriersToPatientCare(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Barriers To Patient Care</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSPhysicalAssessmentSectionBarriersToPatientCare(EMSPhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsPhysicalAssessmentSection The receiving '<em><b>EMS Physical Assessment Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSPhysicalAssessmentSectionBarriersToPatientCare(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsPhysicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_PHYSICAL_ASSESSMENT_SECTION__EMS_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE,
					EmspcrPlugin.INSTANCE.getString("EMSPhysicalAssessmentSectionBarriersToPatientCare"),
					new Object[] { emsPhysicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalAssessmentOrganizer(EMSPhysicalAssessmentSection) <em>Get Physical Assessment Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAssessmentOrganizer(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::PhysicalAssessmentOrganizer))->asSequence()->any(true).oclAsType(emspcr::PhysicalAssessmentOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalAssessmentOrganizer(EMSPhysicalAssessmentSection) <em>Get Physical Assessment Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalAssessmentOrganizer(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PhysicalAssessmentOrganizer getPhysicalAssessmentOrganizer(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection) {
		if (GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(66));
			try {
				GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_QRY = helper.createQuery(GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_QRY);
		return (PhysicalAssessmentOrganizer) query.evaluate(emsPhysicalAssessmentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientPregnancy(EMSPhysicalAssessmentSection) <em>Get Patient Pregnancy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPregnancy(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_PREGNANCY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientPregnancy))->asSequence()->any(true).oclAsType(emspcr::PatientPregnancy)";

	/**
	 * The cached OCL query for the '{@link #getPatientPregnancy(EMSPhysicalAssessmentSection) <em>Get Patient Pregnancy</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPregnancy(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_PREGNANCY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PatientPregnancy getPatientPregnancy(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection) {
		if (GET_PATIENT_PREGNANCY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(67));
			try {
				GET_PATIENT_PREGNANCY__EOCL_QRY = helper.createQuery(GET_PATIENT_PREGNANCY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_PREGNANCY__EOCL_QRY);
		return (PatientPregnancy) query.evaluate(emsPhysicalAssessmentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLastOralIntake(EMSPhysicalAssessmentSection) <em>Get Last Oral Intake</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOralIntake(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LAST_ORAL_INTAKE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::LastOralIntake))->asSequence()->any(true).oclAsType(emspcr::LastOralIntake)";

	/**
	 * The cached OCL query for the '{@link #getLastOralIntake(EMSPhysicalAssessmentSection) <em>Get Last Oral Intake</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastOralIntake(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LAST_ORAL_INTAKE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LastOralIntake getLastOralIntake(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection) {
		if (GET_LAST_ORAL_INTAKE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(68));
			try {
				GET_LAST_ORAL_INTAKE__EOCL_QRY = helper.createQuery(GET_LAST_ORAL_INTAKE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LAST_ORAL_INTAKE__EOCL_QRY);
		return (LastOralIntake) query.evaluate(emsPhysicalAssessmentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientAge(EMSPhysicalAssessmentSection) <em>Get Patient Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientAge(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_AGE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientAge))->asSequence()->any(true).oclAsType(emspcr::PatientAge)";

	/**
	 * The cached OCL query for the '{@link #getPatientAge(EMSPhysicalAssessmentSection) <em>Get Patient Age</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientAge(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_AGE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PatientAge getPatientAge(EMSPhysicalAssessmentSection emsPhysicalAssessmentSection) {
		if (GET_PATIENT_AGE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(69));
			try {
				GET_PATIENT_AGE__EOCL_QRY = helper.createQuery(GET_PATIENT_AGE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_AGE__EOCL_QRY);
		return (PatientAge) query.evaluate(emsPhysicalAssessmentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getThrombolyticContraindications(EMSPhysicalAssessmentSection) <em>Get Thrombolytic Contraindications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrombolyticContraindications(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ThrombolyticContraindications))->asSequence()->any(true).oclAsType(emspcr::ThrombolyticContraindications)";

	/**
	 * The cached OCL query for the '{@link #getThrombolyticContraindications(EMSPhysicalAssessmentSection) <em>Get Thrombolytic Contraindications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrombolyticContraindications(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ThrombolyticContraindications getThrombolyticContraindications(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection) {
		if (GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(70));
			try {
				GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_QRY = helper.createQuery(GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_QRY);
		return (ThrombolyticContraindications) query.evaluate(emsPhysicalAssessmentSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBarriersToPatientCare(EMSPhysicalAssessmentSection) <em>Get Barriers To Patient Care</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarriersToPatientCare(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BARRIERS_TO_PATIENT_CARE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::BarriersToPatientCare))->asSequence()->any(true).oclAsType(emspcr::BarriersToPatientCare)";

	/**
	 * The cached OCL query for the '{@link #getBarriersToPatientCare(EMSPhysicalAssessmentSection) <em>Get Barriers To Patient Care</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarriersToPatientCare(EMSPhysicalAssessmentSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BARRIERS_TO_PATIENT_CARE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BarriersToPatientCare getBarriersToPatientCare(
			EMSPhysicalAssessmentSection emsPhysicalAssessmentSection) {
		if (GET_BARRIERS_TO_PATIENT_CARE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.EMS_PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(71));
			try {
				GET_BARRIERS_TO_PATIENT_CARE__EOCL_QRY = helper.createQuery(GET_BARRIERS_TO_PATIENT_CARE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BARRIERS_TO_PATIENT_CARE__EOCL_QRY);
		return (BarriersToPatientCare) query.evaluate(emsPhysicalAssessmentSection);
	}

} // EMSPhysicalAssessmentSectionOperations

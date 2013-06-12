/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSectionOperations;

import org.openhealthtools.mdht.uml.cda.emspcr.BarriersToPatientCare;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientAge;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Assessment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Physical Assessment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionPatientPregnancy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Patient Pregnancy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionLastOralIntake(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Last Oral Intake</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionPatientAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Patient Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionThrombolyticContraindications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Thrombolytic Contraindications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionBarriersToPatientCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Barriers To Patient Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getPhysicalAssessmentOrganizer() <em>Get Physical Assessment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getPatientPregnancy() <em>Get Patient Pregnancy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getLastOralIntake() <em>Get Last Oral Intake</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getPatientAge() <em>Get Patient Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getThrombolyticContraindications() <em>Get Thrombolytic Contraindications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getBarriersToPatientCare() <em>Get Barriers To Patient Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalAssessmentSectionOperations extends PhysicalExamSectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected PhysicalAssessmentSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionCodeP(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionCodeP(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionCodeP(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionCodeP(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionCodeP(PhysicalAssessmentSection physicalAssessmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionCodeP"),
					new Object[] { physicalAssessmentSection }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSectionCodeP", passToken);
				}
				passToken.add(physicalAssessmentSection);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionCode(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionCode(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '29545-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionCode(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionCode(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionCode(PhysicalAssessmentSection physicalAssessmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(physicalAssessmentSection)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionCode"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionTitle(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionTitle(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Physical Assessment Section')";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionTitle(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionTitle(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionTitle(PhysicalAssessmentSection physicalAssessmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionTitle"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionText(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionText(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionText(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionText(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionText(PhysicalAssessmentSection physicalAssessmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionText"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Physical Assessment Organizer</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::PhysicalAssessmentOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Physical Assessment Organizer</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(
			PhysicalAssessmentSection physicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionPhysicalAssessmentOrganizer"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionPatientPregnancy(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Patient Pregnancy</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionPatientPregnancy(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientPregnancy) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionPatientPregnancy(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Patient Pregnancy</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionPatientPregnancy(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionPatientPregnancy(
			PhysicalAssessmentSection physicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionPatientPregnancy"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionLastOralIntake(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Last Oral Intake</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionLastOralIntake(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::LastOralIntake) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionLastOralIntake(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Last Oral Intake</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionLastOralIntake(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionLastOralIntake(
			PhysicalAssessmentSection physicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionLastOralIntake"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionPatientAge(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Patient Age</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionPatientAge(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::PatientAge) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionPatientAge(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Patient Age</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionPatientAge(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionPatientAge(
			PhysicalAssessmentSection physicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionPatientAge"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionThrombolyticContraindications(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Thrombolytic Contraindications</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionThrombolyticContraindications(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ThrombolyticContraindications) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionThrombolyticContraindications(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Thrombolytic Contraindications</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionThrombolyticContraindications(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionThrombolyticContraindications(
			PhysicalAssessmentSection physicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionThrombolyticContraindications"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalAssessmentSectionBarriersToPatientCare(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Barriers To Patient Care</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionBarriersToPatientCare(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::BarriersToPatientCare) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalAssessmentSectionBarriersToPatientCare(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Barriers To Patient Care</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalAssessmentSectionBarriersToPatientCare(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalAssessmentSectionBarriersToPatientCare(
			PhysicalAssessmentSection physicalAssessmentSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE,
					EmspcrPlugin.INSTANCE.getString("PhysicalAssessmentSectionBarriersToPatientCare"),
					new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getPhysicalAssessmentOrganizer(PhysicalAssessmentSection) <em>Get Physical Assessment Organizer</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPhysicalAssessmentOrganizer(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::PhysicalAssessmentOrganizer))->asSequence()->any(true).oclAsType(emspcr::PhysicalAssessmentOrganizer)";

	/**
	* The cached OCL query for the '{@link #getPhysicalAssessmentOrganizer(PhysicalAssessmentSection) <em>Get Physical Assessment Organizer</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPhysicalAssessmentOrganizer(PhysicalAssessmentSection)
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
			PhysicalAssessmentSection physicalAssessmentSection) {
		if (GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(76));
			try {
				GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_QRY = helper.createQuery(GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_ASSESSMENT_ORGANIZER__EOCL_QRY);
		return (PhysicalAssessmentOrganizer) query.evaluate(physicalAssessmentSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPatientPregnancy(PhysicalAssessmentSection) <em>Get Patient Pregnancy</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientPregnancy(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PATIENT_PREGNANCY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientPregnancy))->asSequence()->any(true).oclAsType(emspcr::PatientPregnancy)";

	/**
	* The cached OCL query for the '{@link #getPatientPregnancy(PhysicalAssessmentSection) <em>Get Patient Pregnancy</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientPregnancy(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PATIENT_PREGNANCY__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PatientPregnancy getPatientPregnancy(PhysicalAssessmentSection physicalAssessmentSection) {
		if (GET_PATIENT_PREGNANCY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(77));
			try {
				GET_PATIENT_PREGNANCY__EOCL_QRY = helper.createQuery(GET_PATIENT_PREGNANCY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_PREGNANCY__EOCL_QRY);
		return (PatientPregnancy) query.evaluate(physicalAssessmentSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getLastOralIntake(PhysicalAssessmentSection) <em>Get Last Oral Intake</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getLastOralIntake(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_LAST_ORAL_INTAKE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::LastOralIntake))->asSequence()->any(true).oclAsType(emspcr::LastOralIntake)";

	/**
	* The cached OCL query for the '{@link #getLastOralIntake(PhysicalAssessmentSection) <em>Get Last Oral Intake</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getLastOralIntake(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_LAST_ORAL_INTAKE__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static LastOralIntake getLastOralIntake(PhysicalAssessmentSection physicalAssessmentSection) {
		if (GET_LAST_ORAL_INTAKE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(78));
			try {
				GET_LAST_ORAL_INTAKE__EOCL_QRY = helper.createQuery(GET_LAST_ORAL_INTAKE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LAST_ORAL_INTAKE__EOCL_QRY);
		return (LastOralIntake) query.evaluate(physicalAssessmentSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getPatientAge(PhysicalAssessmentSection) <em>Get Patient Age</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientAge(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_PATIENT_AGE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::PatientAge))->asSequence()->any(true).oclAsType(emspcr::PatientAge)";

	/**
	* The cached OCL query for the '{@link #getPatientAge(PhysicalAssessmentSection) <em>Get Patient Age</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPatientAge(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PATIENT_AGE__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PatientAge getPatientAge(PhysicalAssessmentSection physicalAssessmentSection) {
		if (GET_PATIENT_AGE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(79));
			try {
				GET_PATIENT_AGE__EOCL_QRY = helper.createQuery(GET_PATIENT_AGE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_AGE__EOCL_QRY);
		return (PatientAge) query.evaluate(physicalAssessmentSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getThrombolyticContraindications(PhysicalAssessmentSection) <em>Get Thrombolytic Contraindications</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getThrombolyticContraindications(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ThrombolyticContraindications))->asSequence()->any(true).oclAsType(emspcr::ThrombolyticContraindications)";

	/**
	* The cached OCL query for the '{@link #getThrombolyticContraindications(PhysicalAssessmentSection) <em>Get Thrombolytic Contraindications</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getThrombolyticContraindications(PhysicalAssessmentSection)
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
			PhysicalAssessmentSection physicalAssessmentSection) {
		if (GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(80));
			try {
				GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_QRY = helper.createQuery(GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_THROMBOLYTIC_CONTRAINDICATIONS__EOCL_QRY);
		return (ThrombolyticContraindications) query.evaluate(physicalAssessmentSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getBarriersToPatientCare(PhysicalAssessmentSection) <em>Get Barriers To Patient Care</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getBarriersToPatientCare(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_BARRIERS_TO_PATIENT_CARE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::BarriersToPatientCare))->asSequence()->any(true).oclAsType(emspcr::BarriersToPatientCare)";

	/**
	* The cached OCL query for the '{@link #getBarriersToPatientCare(PhysicalAssessmentSection) <em>Get Barriers To Patient Care</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getBarriersToPatientCare(PhysicalAssessmentSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_BARRIERS_TO_PATIENT_CARE__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static BarriersToPatientCare getBarriersToPatientCare(PhysicalAssessmentSection physicalAssessmentSection) {
		if (GET_BARRIERS_TO_PATIENT_CARE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION,
				EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION.getEAllOperations().get(81));
			try {
				GET_BARRIERS_TO_PATIENT_CARE__EOCL_QRY = helper.createQuery(GET_BARRIERS_TO_PATIENT_CARE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BARRIERS_TO_PATIENT_CARE__EOCL_QRY);
		return (BarriersToPatientCare) query.evaluate(physicalAssessmentSection);
	}

	/**
	* The cached OCL expression body for the '{@link #validatePhysicalExamSectionTemplateId(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalExamSectionTemplateId(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.20')";

	/**
	* The cached OCL invariant for the '{@link #validatePhysicalExamSectionTemplateId(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validatePhysicalExamSectionTemplateId(PhysicalAssessmentSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param physicalAssessmentSection The receiving '<em><b>Physical Assessment Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validatePhysicalExamSectionTemplateId(PhysicalAssessmentSection physicalAssessmentSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PHYSICAL_ASSESSMENT_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalAssessmentSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PHYSICAL_ASSESSMENT_SECTION__PHYSICAL_EXAM_SECTION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"PhysicalExamSectionTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									physicalAssessmentSection, context) }), new Object[] { physicalAssessmentSection }));
			}

			return false;
		}
		return true;
	}

} // PhysicalAssessmentSectionOperations

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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationAdministered;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Medications Administered Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#validateEMSMedicationsAdministeredSectionMedicationAdministered(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Medication Administered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSMedicationsAdministeredSection#getMedicationAdministereds() <em>Get Medication Administereds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMSMedicationsAdministeredSectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSMedicationsAdministeredSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSMedicationsAdministeredSectionTemplateId(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionTemplateId(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSMedicationsAdministeredSectionTemplateId(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionTemplateId(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsMedicationsAdministeredSection The receiving '<em><b>EMS Medications Administered Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSMedicationsAdministeredSectionTemplateId(
			EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION);
			try {
				VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsMedicationsAdministeredSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("EMSMedicationsAdministeredSectionTemplateId"),
					new Object[] { emsMedicationsAdministeredSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSMedicationsAdministeredSectionCode(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionCode(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67849-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSMedicationsAdministeredSectionCode(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionCode(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsMedicationsAdministeredSection The receiving '<em><b>EMS Medications Administered Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSMedicationsAdministeredSectionCode(
			EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION);
			try {
				VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsMedicationsAdministeredSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSMedicationsAdministeredSectionCode"),
					new Object[] { emsMedicationsAdministeredSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSMedicationsAdministeredSectionCodeP(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionCodeP(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSMedicationsAdministeredSectionCodeP(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionCodeP(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsMedicationsAdministeredSection The receiving '<em><b>EMS Medications Administered Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSMedicationsAdministeredSectionCodeP(
			EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION);
			try {
				VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsMedicationsAdministeredSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_CODE_P,
					EmspcrPlugin.INSTANCE.getString("EMSMedicationsAdministeredSectionCodeP"),
					new Object[] { emsMedicationsAdministeredSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSMedicationsAdministeredSectionTitle(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionTitle(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Medications Administered Section')";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSMedicationsAdministeredSectionTitle(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionTitle(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsMedicationsAdministeredSection The receiving '<em><b>EMS Medications Administered Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSMedicationsAdministeredSectionTitle(
			EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION);
			try {
				VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsMedicationsAdministeredSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSMedicationsAdministeredSectionTitle"),
					new Object[] { emsMedicationsAdministeredSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSMedicationsAdministeredSectionText(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionText(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSMedicationsAdministeredSectionText(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionText(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsMedicationsAdministeredSection The receiving '<em><b>EMS Medications Administered Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSMedicationsAdministeredSectionText(
			EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION);
			try {
				VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsMedicationsAdministeredSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSMedicationsAdministeredSectionText"),
					new Object[] { emsMedicationsAdministeredSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEMSMedicationsAdministeredSectionMedicationAdministered(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Medication Administered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionMedicationAdministered(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(emspcr::MedicationAdministered) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateEMSMedicationsAdministeredSectionMedicationAdministered(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Medications Administered Section Medication Administered</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEMSMedicationsAdministeredSectionMedicationAdministered(EMSMedicationsAdministeredSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param emsMedicationsAdministeredSection The receiving '<em><b>EMS Medications Administered Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEMSMedicationsAdministeredSectionMedicationAdministered(
			EMSMedicationsAdministeredSection emsMedicationsAdministeredSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION);
			try {
				VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMS_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			emsMedicationsAdministeredSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.EMS_MEDICATIONS_ADMINISTERED_SECTION__EMS_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED,
					EmspcrPlugin.INSTANCE.getString("EMSMedicationsAdministeredSectionMedicationAdministered"),
					new Object[] { emsMedicationsAdministeredSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationAdministereds(EMSMedicationsAdministeredSection) <em>Get Medication Administereds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationAdministereds(EMSMedicationsAdministeredSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_ADMINISTEREDS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(emspcr::MedicationAdministered)).oclAsType(emspcr::MedicationAdministered)";

	/**
	 * The cached OCL query for the '{@link #getMedicationAdministereds(EMSMedicationsAdministeredSection) <em>Get Medication Administereds</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationAdministereds(EMSMedicationsAdministeredSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ADMINISTEREDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MedicationAdministered> getMedicationAdministereds(
			EMSMedicationsAdministeredSection emsMedicationsAdministeredSection) {
		if (GET_MEDICATION_ADMINISTEREDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION,
				EmspcrPackage.Literals.EMS_MEDICATIONS_ADMINISTERED_SECTION.getEAllOperations().get(61));
			try {
				GET_MEDICATION_ADMINISTEREDS__EOCL_QRY = helper.createQuery(GET_MEDICATION_ADMINISTEREDS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ADMINISTEREDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MedicationAdministered> result = (Collection<MedicationAdministered>) query.evaluate(emsMedicationsAdministeredSection);
		return new BasicEList.UnmodifiableEList<MedicationAdministered>(result.size(), result.toArray());
	}

} // EMSMedicationsAdministeredSectionOperations

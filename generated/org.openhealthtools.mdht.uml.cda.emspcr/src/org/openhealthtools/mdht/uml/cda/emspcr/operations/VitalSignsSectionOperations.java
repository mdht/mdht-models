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

import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Additional Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#getemspcrVitalSignsOrganizers() <em>Getemspcr Vital Signs Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#getAdditionalVitalSignsOrganizers() <em>Get Additional Vital Signs Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsSection#validateVitalSignsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionOperations extends
		org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsSectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected VitalSignsSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSPCRVitalSignsSectionCode(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VITAL_SIGNS_SECTION__EMSPCR_VITAL_SIGNS_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsSectionCode"), new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsSectionTitle(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionTitle(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'EMS Vital Signs')";

	/**
	* The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsSectionTitle(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionTitle(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSPCRVitalSignsSectionTitle(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VITAL_SIGNS_SECTION__EMSPCR_VITAL_SIGNS_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsSectionTitle"), new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSPCRVitalSignsSectionText(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VITAL_SIGNS_SECTION__EMSPCR_VITAL_SIGNS_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsSectionText"), new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Vital Signs Organizer</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::VitalSignsOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Vital Signs Organizer</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSPCRVitalSignsSectionVitalSignsOrganizer(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VITAL_SIGNS_SECTION__EMSPCR_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsSectionVitalSignsOrganizer"),
					new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Additional Vital Signs Organizer</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(emspcr::AdditionalVitalSignsOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Vital Signs Section Additional Vital Signs Organizer</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateEMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer(
			VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_EMSPCR_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VITAL_SIGNS_SECTION__EMSPCR_VITAL_SIGNS_SECTION_ADDITIONAL_VITAL_SIGNS_ORGANIZER,
					EmspcrPlugin.INSTANCE.getString("EMSPCRVitalSignsSectionAdditionalVitalSignsOrganizer"),
					new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getemspcrVitalSignsOrganizers(VitalSignsSection) <em>Getemspcr Vital Signs Organizers</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #getemspcrVitalSignsOrganizers(VitalSignsSection)
	* @generated
	* @ordered
	*/
	protected static final String GETEMSPCR_VITAL_SIGNS_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::VitalSignsOrganizer)).oclAsType(emspcr::VitalSignsOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getemspcrVitalSignsOrganizers(VitalSignsSection) <em>Getemspcr Vital Signs Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getemspcrVitalSignsOrganizers(VitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETEMSPCR_VITAL_SIGNS_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<VitalSignsOrganizer> getemspcrVitalSignsOrganizers(VitalSignsSection vitalSignsSection) {
		if (GETEMSPCR_VITAL_SIGNS_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.VITAL_SIGNS_SECTION,
				EmspcrPackage.Literals.VITAL_SIGNS_SECTION.getEAllOperations().get(73));
			try {
				GETEMSPCR_VITAL_SIGNS_ORGANIZERS__EOCL_QRY = helper.createQuery(GETEMSPCR_VITAL_SIGNS_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETEMSPCR_VITAL_SIGNS_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSignsOrganizer> result = (Collection<VitalSignsOrganizer>) query.evaluate(vitalSignsSection);
		return new BasicEList.UnmodifiableEList<VitalSignsOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdditionalVitalSignsOrganizers(VitalSignsSection) <em>Get Additional Vital Signs Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalVitalSignsOrganizers(VitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADDITIONAL_VITAL_SIGNS_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(emspcr::AdditionalVitalSignsOrganizer)).oclAsType(emspcr::AdditionalVitalSignsOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getAdditionalVitalSignsOrganizers(VitalSignsSection) <em>Get Additional Vital Signs Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalVitalSignsOrganizers(VitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADDITIONAL_VITAL_SIGNS_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AdditionalVitalSignsOrganizer> getAdditionalVitalSignsOrganizers(
			VitalSignsSection vitalSignsSection) {
		if (GET_ADDITIONAL_VITAL_SIGNS_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.VITAL_SIGNS_SECTION,
				EmspcrPackage.Literals.VITAL_SIGNS_SECTION.getEAllOperations().get(74));
			try {
				GET_ADDITIONAL_VITAL_SIGNS_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_ADDITIONAL_VITAL_SIGNS_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADDITIONAL_VITAL_SIGNS_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AdditionalVitalSignsOrganizer> result = (Collection<AdditionalVitalSignsOrganizer>) query.evaluate(vitalSignsSection);
		return new BasicEList.UnmodifiableEList<AdditionalVitalSignsOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.23')";

	/**
	* The cached OCL invariant for the '{@link #validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Entries Optional Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateVitalSignsSectionEntriesOptionalTemplateId(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"VitalSignsSectionEntriesOptionalTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(vitalSignsSection, context) }),
					new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

} // VitalSignsSectionOperations

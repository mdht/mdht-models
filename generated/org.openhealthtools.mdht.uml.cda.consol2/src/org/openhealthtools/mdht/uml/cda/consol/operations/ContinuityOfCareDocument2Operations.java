/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Continuity Of Care Document2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2Author(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AllergiesSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2MedicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ProblemSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ProceduresSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Procedures Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ResultsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Encounters Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2FunctionalStatusSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2ImmunizationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Immunizations Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2MedicalEquipmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2PayersSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Payers Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2SocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2VitalSignsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2MentalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2NutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2FamilyHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Assigned Person Or Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Represent Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2AuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateContinuityOfCareDocument2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getAllergiesSection2() <em>Get Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getMedicationsSection2() <em>Get Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getProblemSection2() <em>Get Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getProceduresSection2() <em>Get Procedures Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getResultsSection2() <em>Get Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getAdvanceDirectivesSectionEntriesOptional2() <em>Get Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getEncountersSectionEntriesOptional2() <em>Get Encounters Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getFunctionalStatusSection2() <em>Get Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getImmunizationsSection2() <em>Get Immunizations Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getMedicalEquipmentSection2() <em>Get Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getPayersSection2() <em>Get Payers Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getVitalSignsSection2() <em>Get Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getMentalStatusSection() <em>Get Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#getFamilyHistorySection2() <em>Get Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2#validateUSRealmHeader2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocument2Operations extends USRealmHeader2Operations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocument2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2CodeP(ContinuityOfCareDocument2 continuityOfCareDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2ContinuityOfCareDocument2CodeP", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_CODE_P,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2CodeP"),
						new Object[] { continuityOfCareDocument2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2CodeP", passToken);
				}
				passToken.add(continuityOfCareDocument2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '34133-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2Code(ContinuityOfCareDocument2 continuityOfCareDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ContinuityOfCareDocument2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(continuityOfCareDocument2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2ContinuityOfCareDocument2Code", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_CODE,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2Code"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2Author(ContinuityOfCareDocument2 continuityOfCareDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2ContinuityOfCareDocument2Author", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2ContinuityOfCareDocument2Author"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOf(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOf(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOf(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOf(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2DocumentationOf(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOf", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOf"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2AllergiesSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Allergies Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AllergiesSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2AllergiesSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Allergies Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AllergiesSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2AllergiesSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2AllergiesSection2", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_ALLERGIES_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2AllergiesSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2MedicationsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Medications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2MedicationsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2MedicationsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Medications Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2MedicationsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2MedicationsSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2MedicationsSection2", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_MEDICATIONS_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2MedicationsSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ProblemSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Problem Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ProblemSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ProblemSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Problem Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ProblemSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2ProblemSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2ContinuityOfCareDocument2ProblemSection2", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_PROBLEM_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2ProblemSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ProceduresSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Procedures Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ProceduresSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ProceduresSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Procedures Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ProceduresSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2ProceduresSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2ProceduresSection2", "WARNING");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_PROCEDURES_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2ProceduresSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ResultsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Results Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ResultsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ResultsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Results Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ResultsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2ResultsSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2ContinuityOfCareDocument2ResultsSection2", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_RESULTS_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2ResultsSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Advance Directives Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Advance Directives Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2",
			"INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2AdvanceDirectivesSectionEntriesOptional2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Encounters Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Encounters Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2EncountersSectionEntriesOptional2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2EncountersSectionEntriesOptional2", "INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2EncountersSectionEntriesOptional2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2FunctionalStatusSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Functional Status Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2FunctionalStatusSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2FunctionalStatusSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Functional Status Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2FunctionalStatusSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2FunctionalStatusSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2FunctionalStatusSection2", "INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_FUNCTIONAL_STATUS_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2FunctionalStatusSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2ImmunizationsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Immunizations Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ImmunizationsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2ImmunizationsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Immunizations Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2ImmunizationsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2ImmunizationsSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2ImmunizationsSection2", "INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_IMMUNIZATIONS_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2ImmunizationsSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2MedicalEquipmentSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Medical Equipment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2MedicalEquipmentSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2MedicalEquipmentSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Medical Equipment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2MedicalEquipmentSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2MedicalEquipmentSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2MedicalEquipmentSection2", "INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_MEDICAL_EQUIPMENT_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2MedicalEquipmentSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2PayersSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Payers Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2PayersSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2PayersSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Payers Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2PayersSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2PayersSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2ContinuityOfCareDocument2PayersSection2", "INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_PAYERS_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2PayersSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2PlanOfTreatmentSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2PlanOfTreatmentSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2PlanOfTreatmentSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2PlanOfTreatmentSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2PlanOfTreatmentSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2PlanOfTreatmentSection2", "WARNING");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_PLAN_OF_TREATMENT_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2PlanOfTreatmentSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2SocialHistorySection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2SocialHistorySection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2SocialHistorySection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Social History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2SocialHistorySection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2SocialHistorySection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2SocialHistorySection2", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_SOCIAL_HISTORY_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2SocialHistorySection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2VitalSignsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Vital Signs Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2VitalSignsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2VitalSignsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Vital Signs Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2VitalSignsSection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2VitalSignsSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2VitalSignsSection2", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_VITAL_SIGNS_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2VitalSignsSection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2MentalStatusSection(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Mental Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2MentalStatusSection(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2MentalStatusSection(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Mental Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2MentalStatusSection(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2MentalStatusSection(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2MentalStatusSection", "INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_MENTAL_STATUS_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2MentalStatusSection"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2NutritionSection(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2NutritionSection(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2NutritionSection(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Nutrition Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2NutritionSection(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2NutritionSection(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2ContinuityOfCareDocument2NutritionSection", "INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_NUTRITION_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2NutritionSection"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2FamilyHistorySection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Family History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2FamilyHistorySection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2FamilyHistorySection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Family History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2FamilyHistorySection2(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateContinuityOfCareDocument2FamilyHistorySection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2FamilyHistorySection2", "INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_FAMILY_HISTORY_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"ContinuityOfCareDocument2ContinuityOfCareDocument2FamilyHistorySection2"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Assigned Person Or Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(not assignedPerson.oclIsUndefined() or (not assignedAuthoringDevice.oclIsUndefined() and not representedOrganization.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Assigned Person Or Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization",
			"ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_ASSIGNED_PERSON_OR_REPRESENTED_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthorHasAssignedPersonOrRepresentedOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Represent Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((not representedOrganization.oclIsUndefined() and assignedPerson.oclIsUndefined() and assignedAuthoringDevice.oclIsUndefined()) implies id->exists(id | not id.isNullFlavorUndefined() and id.nullFlavor = vocab::NullFlavor::NA))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author Has Represent Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization",
			"ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR_HAS_REPRESENT_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthorHasRepresentOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthor(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthor(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2AuthorAssignedAuthor(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Author Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2AuthorAssignedAuthor(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2AuthorAssignedAuthor(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthor", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_AUTHOR_ASSIGNED_AUTHOR,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2AuthorAssignedAuthor"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PRF).assignedEntity->excluding(null)->reject((not assignedPerson.oclIsUndefined() and not id->isEmpty()) implies id->exists(id | (id.isNullFlavorDefined() and id.extension->isEmpty() and id.root->isEmpty()) or (id.isNullFlavorDefined() and id.root='2.16.840.1.113883.4.6') or (id.root='2.16.840.1.113883.4.6' and id.extension->size() = 1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Has National Provider Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier",
			"WARNING");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityHasNationalProviderIdentifier"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PRF).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId",
			"ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityId"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PRF).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson",
			"INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ASSIGNED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntityAssignedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PRF)->select(typeCode = vocab::x_ServiceEventPerformer::PRF)->reject(typeCode=vocab::x_ServiceEventPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode",
			"ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerTypeCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->select(typeCode = vocab::x_ServiceEventPerformer::PRF)->select(typeCode = vocab::x_ServiceEventPerformer::PRF)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity",
			"INFO");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformerAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventClassCode(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventClassCode", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventClassCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime",
			"ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventEffectiveTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->select(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1))->select(typeCode = vocab::x_ServiceEventPerformer::PRF)->notEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEventPerformer(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformer",
			"WARNING");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEventPerformer"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEvent(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEvent(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateContinuityOfCareDocument2DocumentationOfServiceEvent(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document2 Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateContinuityOfCareDocument2DocumentationOfServiceEvent(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateContinuityOfCareDocument2DocumentationOfServiceEvent(
			ContinuityOfCareDocument2 continuityOfCareDocument2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEvent", "ERROR");

		if (VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			continuityOfCareDocument2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__CONTINUITY_OF_CARE_DOCUMENT2_DOCUMENTATION_OF_SERVICE_EVENT,
							ConsolPlugin.INSTANCE.getString(
								"ContinuityOfCareDocument2ContinuityOfCareDocument2DocumentationOfServiceEvent"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection2(ContinuityOfCareDocument2) <em>Get Allergies Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2))->asSequence()->any(true).oclAsType(consol::AllergiesSection2)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection2(ContinuityOfCareDocument2) <em>Get Allergies Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSection2 getAllergiesSection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_ALLERGIES_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(426));
			try {
				GET_ALLERGIES_SECTION2__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALLERGIES_SECTION2__EOCL_QRY);
		return (AllergiesSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection2(ContinuityOfCareDocument2) <em>Get Medications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2))->asSequence()->any(true).oclAsType(consol::MedicationsSection2)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection2(ContinuityOfCareDocument2) <em>Get Medications Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSection2 getMedicationsSection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_MEDICATIONS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(427));
			try {
				GET_MEDICATIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICATIONS_SECTION2__EOCL_QRY);
		return (MedicationsSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection2(ContinuityOfCareDocument2) <em>Get Problem Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2))->asSequence()->any(true).oclAsType(consol::ProblemSection2)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection2(ContinuityOfCareDocument2) <em>Get Problem Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSection2 getProblemSection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_PROBLEM_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(428));
			try {
				GET_PROBLEM_SECTION2__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_SECTION2__EOCL_QRY);
		return (ProblemSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection2(ContinuityOfCareDocument2) <em>Get Procedures Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection2))->asSequence()->any(true).oclAsType(consol::ProceduresSection2)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection2(ContinuityOfCareDocument2) <em>Get Procedures Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProceduresSection2 getProceduresSection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_PROCEDURES_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(429));
			try {
				GET_PROCEDURES_SECTION2__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURES_SECTION2__EOCL_QRY);
		return (ProceduresSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection2(ContinuityOfCareDocument2) <em>Get Results Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2))->asSequence()->any(true).oclAsType(consol::ResultsSection2)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection2(ContinuityOfCareDocument2) <em>Get Results Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSection2 getResultsSection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_RESULTS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(430));
			try {
				GET_RESULTS_SECTION2__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RESULTS_SECTION2__EOCL_QRY);
		return (ResultsSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSectionEntriesOptional2(ContinuityOfCareDocument2) <em>Get Advance Directives Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::AdvanceDirectivesSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSectionEntriesOptional2(ContinuityOfCareDocument2) <em>Get Advance Directives Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSectionEntriesOptional2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdvanceDirectivesSectionEntriesOptional2 getAdvanceDirectivesSectionEntriesOptional2(
			ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(431));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (AdvanceDirectivesSectionEntriesOptional2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSectionEntriesOptional2(ContinuityOfCareDocument2) <em>Get Encounters Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSectionEntriesOptional2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::EncountersSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSectionEntriesOptional2(ContinuityOfCareDocument2) <em>Get Encounters Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSectionEntriesOptional2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EncountersSectionEntriesOptional2 getEncountersSectionEntriesOptional2(
			ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(432));
			try {
				GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (EncountersSectionEntriesOptional2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection2(ContinuityOfCareDocument2) <em>Get Functional Status Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection2)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection2(ContinuityOfCareDocument2) <em>Get Functional Status Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FunctionalStatusSection2 getFunctionalStatusSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(433));
			try {
				GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY);
		return (FunctionalStatusSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection2(ContinuityOfCareDocument2) <em>Get Immunizations Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSection2))->asSequence()->any(true).oclAsType(consol::ImmunizationsSection2)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection2(ContinuityOfCareDocument2) <em>Get Immunizations Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ImmunizationsSection2 getImmunizationsSection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_IMMUNIZATIONS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(434));
			try {
				GET_IMMUNIZATIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_IMMUNIZATIONS_SECTION2__EOCL_QRY);
		return (ImmunizationsSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection2(ContinuityOfCareDocument2) <em>Get Medical Equipment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2))->asSequence()->any(true).oclAsType(consol::MedicalEquipmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection2(ContinuityOfCareDocument2) <em>Get Medical Equipment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicalEquipmentSection2 getMedicalEquipmentSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(435));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY);
		return (MedicalEquipmentSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayersSection2(ContinuityOfCareDocument2) <em>Get Payers Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYERS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection2))->asSequence()->any(true).oclAsType(consol::PayersSection2)";

	/**
	 * The cached OCL query for the '{@link #getPayersSection2(ContinuityOfCareDocument2) <em>Get Payers Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYERS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PayersSection2 getPayersSection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_PAYERS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(436));
			try {
				GET_PAYERS_SECTION2__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PAYERS_SECTION2__EOCL_QRY);
		return (PayersSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfTreatmentSection2(ContinuityOfCareDocument2) <em>Get Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))->asSequence()->any(true).oclAsType(consol::PlanOfTreatmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfTreatmentSection2(ContinuityOfCareDocument2) <em>Get Plan Of Treatment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfTreatmentSection2 getPlanOfTreatmentSection2(
			ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(437));
			try {
				GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY);
		return (PlanOfTreatmentSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection2(ContinuityOfCareDocument2) <em>Get Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))->asSequence()->any(true).oclAsType(consol::SocialHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection2(ContinuityOfCareDocument2) <em>Get Social History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SocialHistorySection2 getSocialHistorySection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(438));
			try {
				GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY);
		return (SocialHistorySection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection2(ContinuityOfCareDocument2) <em>Get Vital Signs Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2))->asSequence()->any(true).oclAsType(consol::VitalSignsSection2)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection2(ContinuityOfCareDocument2) <em>Get Vital Signs Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSection2 getVitalSignsSection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_VITAL_SIGNS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(439));
			try {
				GET_VITAL_SIGNS_SECTION2__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_SECTION2__EOCL_QRY);
		return (VitalSignsSection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMentalStatusSection(ContinuityOfCareDocument2) <em>Get Mental Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusSection(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENTAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection))->asSequence()->any(true).oclAsType(consol::MentalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getMentalStatusSection(ContinuityOfCareDocument2) <em>Get Mental Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusSection(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENTAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MentalStatusSection getMentalStatusSection(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_MENTAL_STATUS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(440));
			try {
				GET_MENTAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_MENTAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MENTAL_STATUS_SECTION__EOCL_QRY);
		return (MentalStatusSection) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionSection(ContinuityOfCareDocument2) <em>Get Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))->asSequence()->any(true).oclAsType(consol::NutritionSection)";

	/**
	 * The cached OCL query for the '{@link #getNutritionSection(ContinuityOfCareDocument2) <em>Get Nutrition Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NutritionSection getNutritionSection(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_NUTRITION_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(441));
			try {
				GET_NUTRITION_SECTION__EOCL_QRY = helper.createQuery(GET_NUTRITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUTRITION_SECTION__EOCL_QRY);
		return (NutritionSection) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection2(ContinuityOfCareDocument2) <em>Get Family History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection2(ContinuityOfCareDocument2) <em>Get Family History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection2(ContinuityOfCareDocument2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySection2 getFamilyHistorySection2(ContinuityOfCareDocument2 continuityOfCareDocument2) {

		if (GET_FAMILY_HISTORY_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2,
				ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2.getEAllOperations().get(442));
			try {
				GET_FAMILY_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORY_SECTION2__EOCL_QRY);
		return (FamilyHistorySection2) query.evaluate(continuityOfCareDocument2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2TemplateId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.2' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2TemplateId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(ContinuityOfCareDocument2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param continuityOfCareDocument2 The receiving '<em><b>Continuity Of Care Document2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeader2TemplateId(ContinuityOfCareDocument2 continuityOfCareDocument2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ContinuityOfCareDocument2USRealmHeader2TemplateId", "ERROR");

		if (VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT2);
			try {
				VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				continuityOfCareDocument2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.CONTINUITY_OF_CARE_DOCUMENT2__US_REALM_HEADER2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ContinuityOfCareDocument2USRealmHeader2TemplateId"),
						new Object[] { continuityOfCareDocument2 }));
			}

			return false;
		}
		return true;
	}

} // ContinuityOfCareDocument2Operations

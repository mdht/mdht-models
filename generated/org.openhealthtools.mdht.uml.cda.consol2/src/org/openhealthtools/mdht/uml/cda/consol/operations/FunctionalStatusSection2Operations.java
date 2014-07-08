/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;
import org.openhealthtools.mdht.uml.cda.consol.SensoryAndSpeechStatus;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionFunctionalStatusOrganizer2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Organizer2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionFunctionalStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionNonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2SelfCareActivities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Self Care Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSection2SensoryAndSpeechStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Sensory And Speech Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolFunctionalStatusOrganizer2s() <em>Get Consol Functional Status Organizer2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolFunctionalStatusObservation2s() <em>Get Consol Functional Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolCognitiveStatusResultOrganizers() <em>Get Consol Cognitive Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolCognitiveStatusResultObservations() <em>Get Consol Cognitive Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolFunctionalStatusProblemObservations() <em>Get Consol Functional Status Problem Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolCognitiveStatusProblemObservations() <em>Get Consol Cognitive Status Problem Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolNonMedicinalSupplyActivity2s() <em>Get Consol Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolNumberOfPressureUlcersObservations() <em>Get Consol Number Of Pressure Ulcers Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolPressureUlcerObservations() <em>Get Consol Pressure Ulcer Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getConsolHighestPressureUlcerStages() <em>Get Consol Highest Pressure Ulcer Stages</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getSelfCareActivitiess() <em>Get Self Care Activitiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#getSensoryAndSpeechStatuss() <em>Get Sensory And Speech Statuss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2#validateFunctionalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSection2Operations extends FunctionalStatusSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionCodeP(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCodeP(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionCodeP(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCodeP(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection2 The receiving '<em><b>Functional Status Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionCodeP(FunctionalStatusSection2 functionalStatusSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION2__FUNCTIONAL_STATUS_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionCodeP"),
					new Object[] { functionalStatusSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSectionCodeP", passToken);
				}
				passToken.add(functionalStatusSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionFunctionalStatusOrganizer2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Organizer2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusOrganizer2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(consol::FunctionalStatusOrganizer2))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionFunctionalStatusOrganizer2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Organizer2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusOrganizer2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection2 The receiving '<em><b>Functional Status Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionFunctionalStatusOrganizer2(
			FunctionalStatusSection2 functionalStatusSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_ORGANIZER2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION2__FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_ORGANIZER2,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionFunctionalStatusOrganizer2"),
					new Object[] { functionalStatusSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionFunctionalStatusObservation2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusObservation2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::FunctionalStatusObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionFunctionalStatusObservation2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionFunctionalStatusObservation2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection2 The receiving '<em><b>Functional Status Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionFunctionalStatusObservation2(
			FunctionalStatusSection2 functionalStatusSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION2__FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_OBSERVATION2,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionFunctionalStatusObservation2"),
					new Object[] { functionalStatusSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionNonMedicinalSupplyActivity2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionNonMedicinalSupplyActivity2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.supply.oclIsUndefined() and entry.supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionNonMedicinalSupplyActivity2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionNonMedicinalSupplyActivity2(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection2 The receiving '<em><b>Functional Status Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionNonMedicinalSupplyActivity2(
			FunctionalStatusSection2 functionalStatusSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION2__FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY2,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionNonMedicinalSupplyActivity2"),
					new Object[] { functionalStatusSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSection2SelfCareActivities(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Self Care Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSection2SelfCareActivities(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SelfCareActivities))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSection2SelfCareActivities(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Self Care Activities</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSection2SelfCareActivities(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection2 The receiving '<em><b>Functional Status Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSection2SelfCareActivities(
			FunctionalStatusSection2 functionalStatusSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION2__FUNCTIONAL_STATUS_SECTION2_SELF_CARE_ACTIVITIES,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSection2SelfCareActivities"),
					new Object[] { functionalStatusSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSection2SensoryAndSpeechStatus(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Sensory And Speech Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSection2SensoryAndSpeechStatus(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION2_SENSORY_AND_SPEECH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SensoryAndSpeechStatus))";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSection2SensoryAndSpeechStatus(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section2 Sensory And Speech Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSection2SensoryAndSpeechStatus(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION2_SENSORY_AND_SPEECH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection2 The receiving '<em><b>Functional Status Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSection2SensoryAndSpeechStatus(
			FunctionalStatusSection2 functionalStatusSection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION2_SENSORY_AND_SPEECH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION2_SENSORY_AND_SPEECH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION2_SENSORY_AND_SPEECH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_FUNCTIONAL_STATUS_SECTION2_SENSORY_AND_SPEECH_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION2__FUNCTIONAL_STATUS_SECTION2_SENSORY_AND_SPEECH_STATUS,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSection2SensoryAndSpeechStatus"),
					new Object[] { functionalStatusSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolFunctionalStatusOrganizer2s(FunctionalStatusSection2) <em>Get Consol Functional Status Organizer2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFunctionalStatusOrganizer2s(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_FUNCTIONAL_STATUS_ORGANIZER2S__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::FunctionalStatusOrganizer2)).oclAsType(consol::FunctionalStatusOrganizer2)";

	/**
	 * The cached OCL query for the '{@link #getConsolFunctionalStatusOrganizer2s(FunctionalStatusSection2) <em>Get Consol Functional Status Organizer2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFunctionalStatusOrganizer2s(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_FUNCTIONAL_STATUS_ORGANIZER2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FunctionalStatusOrganizer2> getConsolFunctionalStatusOrganizer2s(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_FUNCTIONAL_STATUS_ORGANIZER2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(89));
			try {
				GET_CONSOL_FUNCTIONAL_STATUS_ORGANIZER2S__EOCL_QRY = helper.createQuery(GET_CONSOL_FUNCTIONAL_STATUS_ORGANIZER2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_FUNCTIONAL_STATUS_ORGANIZER2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusOrganizer2> result = (Collection<FunctionalStatusOrganizer2>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<FunctionalStatusOrganizer2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolFunctionalStatusObservation2s(FunctionalStatusSection2) <em>Get Consol Functional Status Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFunctionalStatusObservation2s(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusObservation2)).oclAsType(consol::FunctionalStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolFunctionalStatusObservation2s(FunctionalStatusSection2) <em>Get Consol Functional Status Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFunctionalStatusObservation2s(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FunctionalStatusObservation2> getConsolFunctionalStatusObservation2s(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(90));
			try {
				GET_CONSOL_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY = helper.createQuery(GET_CONSOL_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_FUNCTIONAL_STATUS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusObservation2> result = (Collection<FunctionalStatusObservation2>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<FunctionalStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolCognitiveStatusResultOrganizers(FunctionalStatusSection2) <em>Get Consol Cognitive Status Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCognitiveStatusResultOrganizers(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(consol::CognitiveStatusResultOrganizer)).oclAsType(consol::CognitiveStatusResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getConsolCognitiveStatusResultOrganizers(FunctionalStatusSection2) <em>Get Consol Cognitive Status Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCognitiveStatusResultOrganizers(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CognitiveStatusResultOrganizer> getConsolCognitiveStatusResultOrganizers(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(91));
			try {
				GET_CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_COGNITIVE_STATUS_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusResultOrganizer> result = (Collection<CognitiveStatusResultOrganizer>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<CognitiveStatusResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolCognitiveStatusResultObservations(FunctionalStatusSection2) <em>Get Consol Cognitive Status Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCognitiveStatusResultObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusResultObservation)).oclAsType(consol::CognitiveStatusResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolCognitiveStatusResultObservations(FunctionalStatusSection2) <em>Get Consol Cognitive Status Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCognitiveStatusResultObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CognitiveStatusResultObservation> getConsolCognitiveStatusResultObservations(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(92));
			try {
				GET_CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusResultObservation> result = (Collection<CognitiveStatusResultObservation>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<CognitiveStatusResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolFunctionalStatusProblemObservations(FunctionalStatusSection2) <em>Get Consol Functional Status Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFunctionalStatusProblemObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::FunctionalStatusProblemObservation)).oclAsType(consol::FunctionalStatusProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolFunctionalStatusProblemObservations(FunctionalStatusSection2) <em>Get Consol Functional Status Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolFunctionalStatusProblemObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<FunctionalStatusProblemObservation> getConsolFunctionalStatusProblemObservations(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(93));
			try {
				GET_CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_FUNCTIONAL_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusProblemObservation> result = (Collection<FunctionalStatusProblemObservation>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<FunctionalStatusProblemObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolCognitiveStatusProblemObservations(FunctionalStatusSection2) <em>Get Consol Cognitive Status Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCognitiveStatusProblemObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CognitiveStatusProblemObservation)).oclAsType(consol::CognitiveStatusProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolCognitiveStatusProblemObservations(FunctionalStatusSection2) <em>Get Consol Cognitive Status Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCognitiveStatusProblemObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CognitiveStatusProblemObservation> getConsolCognitiveStatusProblemObservations(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(94));
			try {
				GET_CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_COGNITIVE_STATUS_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusProblemObservation> result = (Collection<CognitiveStatusProblemObservation>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<CognitiveStatusProblemObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolNonMedicinalSupplyActivity2s(FunctionalStatusSection2) <em>Get Consol Non Medicinal Supply Activity2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolNonMedicinalSupplyActivity2s(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_EXP = "self.getSupplies()->select(supply : cda::Supply | not supply.oclIsUndefined() and supply.oclIsKindOf(consol::NonMedicinalSupplyActivity2)).oclAsType(consol::NonMedicinalSupplyActivity2)";

	/**
	 * The cached OCL query for the '{@link #getConsolNonMedicinalSupplyActivity2s(FunctionalStatusSection2) <em>Get Consol Non Medicinal Supply Activity2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolNonMedicinalSupplyActivity2s(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NonMedicinalSupplyActivity2> getConsolNonMedicinalSupplyActivity2s(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(95));
			try {
				GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY = helper.createQuery(GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_NON_MEDICINAL_SUPPLY_ACTIVITY2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NonMedicinalSupplyActivity2> result = (Collection<NonMedicinalSupplyActivity2>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<NonMedicinalSupplyActivity2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolNumberOfPressureUlcersObservations(FunctionalStatusSection2) <em>Get Consol Number Of Pressure Ulcers Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolNumberOfPressureUlcersObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::NumberOfPressureUlcersObservation)).oclAsType(consol::NumberOfPressureUlcersObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolNumberOfPressureUlcersObservations(FunctionalStatusSection2) <em>Get Consol Number Of Pressure Ulcers Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolNumberOfPressureUlcersObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<NumberOfPressureUlcersObservation> getConsolNumberOfPressureUlcersObservations(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(96));
			try {
				GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_NUMBER_OF_PRESSURE_ULCERS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<NumberOfPressureUlcersObservation> result = (Collection<NumberOfPressureUlcersObservation>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<NumberOfPressureUlcersObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolPressureUlcerObservations(FunctionalStatusSection2) <em>Get Consol Pressure Ulcer Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPressureUlcerObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PressureUlcerObservation)).oclAsType(consol::PressureUlcerObservation)";

	/**
	 * The cached OCL query for the '{@link #getConsolPressureUlcerObservations(FunctionalStatusSection2) <em>Get Consol Pressure Ulcer Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolPressureUlcerObservations(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PressureUlcerObservation> getConsolPressureUlcerObservations(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(97));
			try {
				GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_PRESSURE_ULCER_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PressureUlcerObservation> result = (Collection<PressureUlcerObservation>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<PressureUlcerObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolHighestPressureUlcerStages(FunctionalStatusSection2) <em>Get Consol Highest Pressure Ulcer Stages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolHighestPressureUlcerStages(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HighestPressureUlcerStage)).oclAsType(consol::HighestPressureUlcerStage)";

	/**
	 * The cached OCL query for the '{@link #getConsolHighestPressureUlcerStages(FunctionalStatusSection2) <em>Get Consol Highest Pressure Ulcer Stages</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolHighestPressureUlcerStages(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HighestPressureUlcerStage> getConsolHighestPressureUlcerStages(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(98));
			try {
				GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY = helper.createQuery(GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_HIGHEST_PRESSURE_ULCER_STAGES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HighestPressureUlcerStage> result = (Collection<HighestPressureUlcerStage>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<HighestPressureUlcerStage>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSelfCareActivitiess(FunctionalStatusSection2) <em>Get Self Care Activitiess</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfCareActivitiess(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SELF_CARE_ACTIVITIESS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SelfCareActivities)).oclAsType(consol::SelfCareActivities)";

	/**
	 * The cached OCL query for the '{@link #getSelfCareActivitiess(FunctionalStatusSection2) <em>Get Self Care Activitiess</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfCareActivitiess(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SELF_CARE_ACTIVITIESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SelfCareActivities> getSelfCareActivitiess(FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_SELF_CARE_ACTIVITIESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(99));
			try {
				GET_SELF_CARE_ACTIVITIESS__EOCL_QRY = helper.createQuery(GET_SELF_CARE_ACTIVITIESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SELF_CARE_ACTIVITIESS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SelfCareActivities> result = (Collection<SelfCareActivities>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<SelfCareActivities>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSensoryAndSpeechStatuss(FunctionalStatusSection2) <em>Get Sensory And Speech Statuss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensoryAndSpeechStatuss(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SENSORY_AND_SPEECH_STATUSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SensoryAndSpeechStatus)).oclAsType(consol::SensoryAndSpeechStatus)";

	/**
	 * The cached OCL query for the '{@link #getSensoryAndSpeechStatuss(FunctionalStatusSection2) <em>Get Sensory And Speech Statuss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensoryAndSpeechStatuss(FunctionalStatusSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SENSORY_AND_SPEECH_STATUSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SensoryAndSpeechStatus> getSensoryAndSpeechStatuss(
			FunctionalStatusSection2 functionalStatusSection2) {
		if (GET_SENSORY_AND_SPEECH_STATUSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2,
				ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2.getEAllOperations().get(100));
			try {
				GET_SENSORY_AND_SPEECH_STATUSS__EOCL_QRY = helper.createQuery(GET_SENSORY_AND_SPEECH_STATUSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SENSORY_AND_SPEECH_STATUSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SensoryAndSpeechStatus> result = (Collection<SensoryAndSpeechStatus>) query.evaluate(functionalStatusSection2);
		return new BasicEList.UnmodifiableEList<SensoryAndSpeechStatus>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.14.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionTemplateId(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection2 The receiving '<em><b>Functional Status Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionTemplateId(FunctionalStatusSection2 functionalStatusSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION2__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionTemplateId"),
					new Object[] { functionalStatusSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFunctionalStatusSectionCode(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCode(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '47420-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateFunctionalStatusSectionCode(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFunctionalStatusSectionCode(FunctionalStatusSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param functionalStatusSection2 The receiving '<em><b>Functional Status Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFunctionalStatusSectionCode(FunctionalStatusSection2 functionalStatusSection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(functionalStatusSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2);
			try {
				VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			functionalStatusSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.FUNCTIONAL_STATUS_SECTION2__FUNCTIONAL_STATUS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("FunctionalStatusSectionCode"),
					new Object[] { functionalStatusSection2 }));
			}

			return false;
		}
		return true;
	}

} // FunctionalStatusSection2Operations

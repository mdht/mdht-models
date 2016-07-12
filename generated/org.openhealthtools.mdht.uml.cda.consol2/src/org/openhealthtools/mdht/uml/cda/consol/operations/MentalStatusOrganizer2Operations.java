/**
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateMentalStatusOrganizer2HasCodeOrEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Has Code Or Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateMentalStatusOrganizer2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateMentalStatusOrganizer2CDCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 CD Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#getConsolMentalStatusObservation2s() <em>Get Consol Mental Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateCognitiveStatusResultOrganizerCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2#validateResultOrganizerResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Result Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MentalStatusOrganizer2Operations extends CognitiveStatusResultOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusOrganizer2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusOrganizer2HasCodeOrEffectiveTime(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Has Code Or Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusOrganizer2HasCodeOrEffectiveTime(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_ORGANIZER2_HAS_CODE_OR_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() or not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusOrganizer2HasCodeOrEffectiveTime(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Has Code Or Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusOrganizer2HasCodeOrEffectiveTime(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_ORGANIZER2_HAS_CODE_OR_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusOrganizer2 The receiving '<em><b>Mental Status Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusOrganizer2HasCodeOrEffectiveTime(
			MentalStatusOrganizer2 mentalStatusOrganizer2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_ORGANIZER2_HAS_CODE_OR_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2);
			try {
				VALIDATE_MENTAL_STATUS_ORGANIZER2_HAS_CODE_OR_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MENTAL_STATUS_ORGANIZER2_HAS_CODE_OR_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_ORGANIZER2_HAS_CODE_OR_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				mentalStatusOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MENTAL_STATUS_ORGANIZER2__MENTAL_STATUS_ORGANIZER2_HAS_CODE_OR_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString(
							"MentalStatusOrganizer2MentalStatusOrganizer2HasCodeOrEffectiveTime"),
						new Object[] { mentalStatusOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusOrganizer2EffectiveTime(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusOrganizer2EffectiveTime(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_ORGANIZER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusOrganizer2EffectiveTime(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusOrganizer2EffectiveTime(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MENTAL_STATUS_ORGANIZER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusOrganizer2 The receiving '<em><b>Mental Status Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateMentalStatusOrganizer2EffectiveTime(MentalStatusOrganizer2 mentalStatusOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_ORGANIZER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2);
			try {
				VALIDATE_MENTAL_STATUS_ORGANIZER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_MENTAL_STATUS_ORGANIZER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_MENTAL_STATUS_ORGANIZER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				mentalStatusOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MENTAL_STATUS_ORGANIZER2__MENTAL_STATUS_ORGANIZER2_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("MentalStatusOrganizer2MentalStatusOrganizer2EffectiveTime"),
						new Object[] { mentalStatusOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMentalStatusOrganizer2CDCode(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 CD Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusOrganizer2CDCode(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENTAL_STATUS_ORGANIZER2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateMentalStatusOrganizer2CDCode(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Organizer2 CD Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMentalStatusOrganizer2CDCode(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_MENTAL_STATUS_ORGANIZER2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusOrganizer2 The receiving '<em><b>Mental Status Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateMentalStatusOrganizer2CDCode(MentalStatusOrganizer2 mentalStatusOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_MENTAL_STATUS_ORGANIZER2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_MENTAL_STATUS_ORGANIZER2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_MENTAL_STATUS_ORGANIZER2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_MENTAL_STATUS_ORGANIZER2_CD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			mentalStatusOrganizer2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.MENTAL_STATUS_ORGANIZER2__MENTAL_STATUS_ORGANIZER2_CD_CODE,
							ConsolPlugin.INSTANCE.getString("MentalStatusOrganizer2MentalStatusOrganizer2CDCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolMentalStatusObservation2s(MentalStatusOrganizer2) <em>Get Consol Mental Status Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMentalStatusObservation2s(MentalStatusOrganizer2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_MENTAL_STATUS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::MentalStatusObservation2)).oclAsType(consol::MentalStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolMentalStatusObservation2s(MentalStatusOrganizer2) <em>Get Consol Mental Status Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolMentalStatusObservation2s(MentalStatusOrganizer2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<MentalStatusObservation2> getConsolMentalStatusObservation2s(
			MentalStatusOrganizer2 mentalStatusOrganizer2) {
		if (GET_CONSOL_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2,
				ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2.getEAllOperations().get(68));
			try {
				GET_CONSOL_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_MENTAL_STATUS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_MENTAL_STATUS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MentalStatusObservation2> result = (Collection<MentalStatusObservation2>) query.evaluate(
			mentalStatusOrganizer2);
		return new BasicEList.UnmodifiableEList<MentalStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCognitiveStatusResultOrganizerCodeCodeSystem(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Code Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultOrganizerCodeCodeSystem(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.isNullFlavorDefined() or self.code.codeSystem = '2.16.840.1.113883.6.254' or self.code.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateCognitiveStatusResultOrganizerCodeCodeSystem(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Organizer Code Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCognitiveStatusResultOrganizerCodeCodeSystem(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusOrganizer2 The receiving '<em><b>Mental Status Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCognitiveStatusResultOrganizerCodeCodeSystem(
			MentalStatusOrganizer2 mentalStatusOrganizer2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2);
			try {
				VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
				mentalStatusOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MENTAL_STATUS_ORGANIZER2__COGNITIVE_STATUS_RESULT_ORGANIZER_CODE_CODE_SYSTEM,
						ConsolPlugin.INSTANCE.getString(
							"MentalStatusOrganizer2CognitiveStatusResultOrganizerCodeCodeSystem"),
						new Object[] { mentalStatusOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.75' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusOrganizer2 The receiving '<em><b>Mental Status Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerTemplateId(MentalStatusOrganizer2 mentalStatusOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2);
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MENTAL_STATUS_ORGANIZER2__RESULT_ORGANIZER_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("MentalStatusOrganizer2ResultOrganizerTemplateId"),
						new Object[] { mentalStatusOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerCode(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerCode(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerCode(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerCode(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusOrganizer2 The receiving '<em><b>Mental Status Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerCode(MentalStatusOrganizer2 mentalStatusOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2);
			try {
				VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MENTAL_STATUS_ORGANIZER2__RESULT_ORGANIZER_CODE,
						ConsolPlugin.INSTANCE.getString("MentalStatusOrganizer2ResultOrganizerCode"),
						new Object[] { mentalStatusOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerResultObservation(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerResultObservation(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::MentalStatusObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerResultObservation(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerResultObservation(MentalStatusOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mentalStatusOrganizer2 The receiving '<em><b>Mental Status Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultOrganizerResultObservation(MentalStatusOrganizer2 mentalStatusOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MENTAL_STATUS_ORGANIZER2);
			try {
				VALIDATE_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			mentalStatusOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MENTAL_STATUS_ORGANIZER2__RESULT_ORGANIZER_RESULT_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("MentalStatusOrganizer2ResultOrganizerResultObservation"),
						new Object[] { mentalStatusOrganizer2 }));
			}

			return false;
		}
		return true;
	}

} // MentalStatusOrganizer2Operations

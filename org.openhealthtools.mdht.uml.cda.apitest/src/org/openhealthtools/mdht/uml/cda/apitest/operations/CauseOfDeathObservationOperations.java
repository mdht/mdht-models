/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.AgeObservation;
import org.openhealthtools.mdht.uml.cda.apitest.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cause Of Death Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.CauseOfDeathObservation#getAPITestAgeObservation() <em>Get API Test Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.CauseOfDeathObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CauseOfDeathObservationOperations extends FamilyHistoryObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CauseOfDeathObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getAPITestAgeObservation(CauseOfDeathObservation) <em>Get API Test Age Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPITestAgeObservation(CauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_API_TEST_AGE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::AgeObservation))->asSequence()->first().oclAsType(apitest::AgeObservation)";

	/**
	 * The cached OCL query for the '{@link #getAPITestAgeObservation(CauseOfDeathObservation) <em>Get API Test Age Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPITestAgeObservation(CauseOfDeathObservation)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_API_TEST_AGE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(apitest::AgeObservation))->asSequence()->first().oclAsType(apitest::AgeObservation)
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static AgeObservation getAPITestAgeObservation(CauseOfDeathObservation causeOfDeathObservation) {
		if (GET_API_TEST_AGE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				APITestPackage.Literals.CAUSE_OF_DEATH_OBSERVATION,
				APITestPackage.Literals.CAUSE_OF_DEATH_OBSERVATION.getEAllOperations().get(53));
			try {
				GET_API_TEST_AGE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_API_TEST_AGE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_API_TEST_AGE_OBSERVATION__EOCL_QRY);
		return (AgeObservation) query.evaluate(causeOfDeathObservation);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFamilyHistoryObservationTemplateId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationTemplateId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.42')";

	/**
	 * The cached OCL invariant for the '{@link #validateFamilyHistoryObservationTemplateId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFamilyHistoryObservationTemplateId(CauseOfDeathObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.42')
	 * @param causeOfDeathObservation The receiving '<em><b>Cause Of Death Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateFamilyHistoryObservationTemplateId(CauseOfDeathObservation causeOfDeathObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CAUSE_OF_DEATH_OBSERVATION);
			try {
				VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			causeOfDeathObservation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, APITestValidator.DIAGNOSTIC_SOURCE,
					APITestValidator.CAUSE_OF_DEATH_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"FamilyHistoryObservationTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									causeOfDeathObservation, context) }), new Object[] { causeOfDeathObservation }));
			}
			return false;
		}
		return true;
	}

} // CauseOfDeathObservationOperations

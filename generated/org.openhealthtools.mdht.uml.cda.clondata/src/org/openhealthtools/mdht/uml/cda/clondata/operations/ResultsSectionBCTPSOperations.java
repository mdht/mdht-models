/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.CardiacFunctionObservation;
import org.openhealthtools.mdht.uml.cda.clondata.ReceptorStatusOrganizer;
import org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultsSectionEntriesOptionalOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Results Section BCTPS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS#getReceptorStatusOrganizer() <em>Get Receptor Status Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS#getCardiacFunctionObservation() <em>Get Cardiac Function Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ResultsSectionBCTPS#validateResultsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultsSectionBCTPSOperations extends ResultsSectionEntriesOptionalOperations {
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
	protected ResultsSectionBCTPSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #getReceptorStatusOrganizer(ResultsSectionBCTPS) <em>Get Receptor Status Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptorStatusOrganizer(ResultsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RECEPTOR_STATUS_ORGANIZER__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(clondata::ReceptorStatusOrganizer))->asSequence()->any(true).oclAsType(clondata::ReceptorStatusOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getReceptorStatusOrganizer(ResultsSectionBCTPS) <em>Get Receptor Status Organizer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceptorStatusOrganizer(ResultsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RECEPTOR_STATUS_ORGANIZER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReceptorStatusOrganizer getReceptorStatusOrganizer(ResultsSectionBCTPS resultsSectionBCTPS) {

		if (GET_RECEPTOR_STATUS_ORGANIZER__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getResultsSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getResultsSectionBCTPS().getEAllOperations().get(62));
			try {
				GET_RECEPTOR_STATUS_ORGANIZER__EOCL_QRY = helper.createQuery(GET_RECEPTOR_STATUS_ORGANIZER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RECEPTOR_STATUS_ORGANIZER__EOCL_QRY);
		return (ReceptorStatusOrganizer) query.evaluate(resultsSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCardiacFunctionObservation(ResultsSectionBCTPS) <em>Get Cardiac Function Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardiacFunctionObservation(ResultsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CARDIAC_FUNCTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(clondata::CardiacFunctionObservation))->asSequence()->any(true).oclAsType(clondata::CardiacFunctionObservation)";

	/**
	 * The cached OCL query for the '{@link #getCardiacFunctionObservation(ResultsSectionBCTPS) <em>Get Cardiac Function Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardiacFunctionObservation(ResultsSectionBCTPS)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CARDIAC_FUNCTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CardiacFunctionObservation getCardiacFunctionObservation(ResultsSectionBCTPS resultsSectionBCTPS) {

		if (GET_CARDIAC_FUNCTION_OBSERVATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getResultsSectionBCTPS(),
				CLONDATAPackage.eINSTANCE.getResultsSectionBCTPS().getEAllOperations().get(63));
			try {
				GET_CARDIAC_FUNCTION_OBSERVATION__EOCL_QRY = helper.createQuery(
					GET_CARDIAC_FUNCTION_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CARDIAC_FUNCTION_OBSERVATION__EOCL_QRY);
		return (CardiacFunctionObservation) query.evaluate(resultsSectionBCTPS);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.2.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionEntriesOptionalTemplateId(ResultsSectionBCTPS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param resultsSectionBCTPS The receiving '<em><b>Results Section BCTPS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultsSectionEntriesOptionalTemplateId(ResultsSectionBCTPS resultsSectionBCTPS,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getResultsSectionBCTPS());
			try {
				VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				resultsSectionBCTPS)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.RESULTS_SECTION_BCTPS__RESULTS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ResultsSectionBCTPSResultsSectionEntriesOptionalTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										resultsSectionBCTPS, context) }),
						new Object[] { resultsSectionBCTPS }));
			}

			return false;
		}
		return true;
	}

} // ResultsSectionBCTPSOperations

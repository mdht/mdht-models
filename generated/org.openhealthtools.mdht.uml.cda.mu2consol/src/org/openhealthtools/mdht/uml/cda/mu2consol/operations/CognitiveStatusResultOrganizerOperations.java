/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

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

import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Cognitive Status Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Result Organizer Template Id</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer#getMu2consolCognitiveStatusResultObservations()
 * <em>Get Mu2consol Cognitive Status Result Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CognitiveStatusResultOrganizerOperations
		extends org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusResultOrganizerOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected CognitiveStatusResultOrganizerOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param cognitiveStatusResultOrganizer
	 *            The receiving ' <em><b>Cognitive Status Result
	 *            Organizer</b></em>' model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateResultOrganizerTemplateId(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
						helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get())
				.check(cognitiveStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.COGNITIVE_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
						Mu2consolPlugin.INSTANCE.getString("CognitiveStatusResultOrganizerResultOrganizerTemplateId"),
						new Object[] { cognitiveStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateResultOrganizerTemplateId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Result Organizer Template Id</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateResultOrganizerTemplateId(CognitiveStatusResultOrganizer,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.75')";

	/**
	 * The cached OCL invariant for the
	 * '{@link #validateResultOrganizerTemplateId(CognitiveStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateResultOrganizerTemplateId(CognitiveStatusResultOrganizer,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the
	 * '{@link #getMu2consolCognitiveStatusResultObservations(CognitiveStatusResultOrganizer)
	 * <em>Get Mu2consol Cognitive Status Result Observations</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMu2consolCognitiveStatusResultObservations(CognitiveStatusResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mu2consol::CognitiveStatusResultObservation)).oclAsType(mu2consol::CognitiveStatusResultObservation)";

	/**
	 * The cached OCL query for the
	 * '{@link #getMu2consolCognitiveStatusResultObservations(CognitiveStatusResultOrganizer)
	 * <em>Get Mu2consol Cognitive Status Result Observations</em>}' query
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getMu2consolCognitiveStatusResultObservations(CognitiveStatusResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */

	public static EList<CognitiveStatusResultObservation> getMu2consolCognitiveStatusResultObservations(
			CognitiveStatusResultOrganizer cognitiveStatusResultOrganizer) {

		if (GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER,
					Mu2consolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER.getEAllOperations().get(66));
			try {
				GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY = helper
						.createQuery(GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_MU2CONSOL_COGNITIVE_STATUS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CognitiveStatusResultObservation> result = (Collection<CognitiveStatusResultObservation>) query
				.evaluate(cognitiveStatusResultOrganizer);
		return new BasicEList.UnmodifiableEList<CognitiveStatusResultObservation>(result.size(), result.toArray());
	}

} // CognitiveStatusResultOrganizerOperations
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

import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Functional Status Result Organizer</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Result Organizer Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusResultOrganizer#getMu2consolFunctionalStatusResultObservations()
 * <em>Get Mu2consol Functional Status Result Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusResultOrganizerOperations
		extends org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusResultOrganizerOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FunctionalStatusResultOrganizerOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 *
	 * @param functionalStatusResultOrganizer
	 *            The receiving '
	 *            <em><b>Functional Status Result Organizer</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateResultOrganizerTemplateId(
			FunctionalStatusResultOrganizer functionalStatusResultOrganizer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
						.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV)
				.check(functionalStatusResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, Mu2consolValidator.DIAGNOSTIC_SOURCE,
						Mu2consolValidator.FUNCTIONAL_STATUS_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
						Mu2consolPlugin.INSTANCE.getString("FunctionalStatusResultOrganizerResultOrganizerTemplateId"),
						new Object[] { functionalStatusResultOrganizer }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateResultOrganizerTemplateId(FunctionalStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Result Organizer Template Id</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #validateResultOrganizerTemplateId(FunctionalStatusResultOrganizer,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.66')";

	/**
	 * The cached OCL invariant for the '
	 * {@link #validateResultOrganizerTemplateId(FunctionalStatusResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateResultOrganizerTemplateId(FunctionalStatusResultOrganizer,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMu2consolFunctionalStatusResultObservations(FunctionalStatusResultOrganizer)
	 * <em>Get Mu2consol Functional Status Result Observations</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMu2consolFunctionalStatusResultObservations(FunctionalStatusResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mu2consol::FunctionalStatusResultObservation)).oclAsType(mu2consol::FunctionalStatusResultObservation)";

	/**
	 * The cached OCL query for the '
	 * {@link #getMu2consolFunctionalStatusResultObservations(FunctionalStatusResultOrganizer)
	 * <em>Get Mu2consol Functional Status Result Observations</em>}' query
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMu2consolFunctionalStatusResultObservations(FunctionalStatusResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	public static EList<FunctionalStatusResultObservation> getMu2consolFunctionalStatusResultObservations(
			FunctionalStatusResultOrganizer functionalStatusResultOrganizer) {
		if (GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.FUNCTIONAL_STATUS_RESULT_ORGANIZER,
					Mu2consolPackage.Literals.FUNCTIONAL_STATUS_RESULT_ORGANIZER.getEAllOperations().get(66));
			try {
				GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY = helper
						.createQuery(GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_FUNCTIONAL_STATUS_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FunctionalStatusResultObservation> result = (Collection<FunctionalStatusResultObservation>) query
				.evaluate(functionalStatusResultOrganizer);
		return new BasicEList.UnmodifiableEList<FunctionalStatusResultObservation>(result.size(), result.toArray());
	}

} // FunctionalStatusResultOrganizerOperations
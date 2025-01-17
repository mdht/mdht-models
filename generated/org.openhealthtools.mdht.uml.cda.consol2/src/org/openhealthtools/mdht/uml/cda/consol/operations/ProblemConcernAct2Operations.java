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
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PriorityPreference;
import org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Concern Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernAct2PriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#getPriorityPreferences() <em>Get Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#getConsolProblemObservation2s() <em>Get Consol Problem Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemConcernAct2#validateProblemConcernActProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemConcernAct2Operations extends ProblemConcernActOperations {
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
	protected ProblemConcernAct2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernAct2TemplateId(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernAct2TemplateId(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.3' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernAct2TemplateId(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernAct2TemplateId(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernAct2TemplateId(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernAct2TemplateId", "ERROR");

		if (VALIDATE_PROBLEM_CONCERN_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernAct2TemplateId"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernActStatusCodeP(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernActStatusCodeP", "ERROR");

		if (VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT_STATUS_CODE_P,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernActStatusCodeP"),
						new Object[] { problemConcernAct2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActStatusCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActStatusCodeP", passToken);
				}
				passToken.add(problemConcernAct2);
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernAct2AuthorParticipation(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernAct2AuthorParticipation", "WARNING");

		if (VALIDATE_PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernAct2AuthorParticipation"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernAct2PriorityPreference(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernAct2PriorityPreference", "INFO");

		if (VALIDATE_PROBLEM_CONCERN_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_CONCERN_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT2_PRIORITY_PREFERENCE,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernAct2PriorityPreference"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<PriorityPreference> getPriorityPreferences(ProblemConcernAct2 problemConcernAct2) {

		if (GET_PRIORITY_PREFERENCES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROBLEM_CONCERN_ACT2,
				ConsolPackage.Literals.PROBLEM_CONCERN_ACT2.getEAllOperations().get(67));
			try {
				GET_PRIORITY_PREFERENCES__EOCL_QRY = helper.createQuery(GET_PRIORITY_PREFERENCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PRIORITY_PREFERENCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PriorityPreference> result = (Collection<PriorityPreference>) query.evaluate(problemConcernAct2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<ProblemObservation2> getConsolProblemObservation2s(ProblemConcernAct2 problemConcernAct2) {

		if (GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROBLEM_CONCERN_ACT2,
				ConsolPackage.Literals.PROBLEM_CONCERN_ACT2.getEAllOperations().get(68));
			try {
				GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation2> result = (Collection<ProblemObservation2>) query.evaluate(problemConcernAct2);
		return new BasicEList.UnmodifiableEList<>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernActEffectiveTimeLow(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernActEffectiveTimeLow", "ERROR");

		if (VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernActEffectiveTimeLow"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernActEffectiveTimeHigh(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernActEffectiveTimeHigh", "INFO");

		if (VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernActEffectiveTimeHigh"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernActStatusCodeP(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActStatusCodeP(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernActStatusCodeP(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActStatusCodeP(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernAct2AuthorParticipation(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernAct2AuthorParticipation(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernAct2AuthorParticipation(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernAct2AuthorParticipation(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernAct2PriorityPreference(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Priority Preference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernAct2PriorityPreference(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::PriorityPreference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernAct2PriorityPreference(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act2 Priority Preference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernAct2PriorityPreference(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT2_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #getPriorityPreferences(ProblemConcernAct2) <em>Get Priority Preferences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(ProblemConcernAct2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRIORITY_PREFERENCES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::PriorityPreference)).oclAsType(consol::PriorityPreference)";

	/**
	 * The cached OCL query for the '{@link #getPriorityPreferences(ProblemConcernAct2) <em>Get Priority Preferences</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityPreferences(ProblemConcernAct2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRIORITY_PREFERENCES__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #getConsolProblemObservation2s(ProblemConcernAct2) <em>Get Consol Problem Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(ProblemConcernAct2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation2)).oclAsType(consol::ProblemObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolProblemObservation2s(ProblemConcernAct2) <em>Get Consol Problem Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolProblemObservation2s(ProblemConcernAct2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_PROBLEM_OBSERVATION2S__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernActEffectiveTimeLow(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActEffectiveTimeLow(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernActEffectiveTimeLow(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActEffectiveTimeLow(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernActEffectiveTimeHigh(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActEffectiveTimeHigh(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.high.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernActEffectiveTimeHigh(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActEffectiveTimeHigh(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernActStatusCode(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActStatusCode(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " +
			"value.code = 'active' or value.code = 'suspended' or value.code = 'aborted' or value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernActStatusCode(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActStatusCode(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernActStatusCode(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActStatusCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(problemConcernAct2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernActStatusCode", "ERROR");

		if (VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT_STATUS_CODE,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernActStatusCode"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernActEffectiveTime(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActEffectiveTime(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernActEffectiveTime(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActEffectiveTime(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernActEffectiveTime(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernActEffectiveTime", "ERROR");

		if (VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernActEffectiveTime"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernActCodeP(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActCodeP(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernActCodeP(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActCodeP(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernActCodeP(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernActCodeP", "ERROR");

		if (VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT_CODE_P,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernActCodeP"),
						new Object[] { problemConcernAct2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActCodeP", passToken);
				}
				passToken.add(problemConcernAct2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernActCode(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActCode(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'CONC' and value.codeSystem = '2.16.840.1.113883.5.6')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernActCode(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActCode(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernActCode(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ProblemConcernActCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(problemConcernAct2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernActCode", "ERROR");

		if (VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_PROBLEM_CONCERN_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT_CODE,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernActCode"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemConcernActProblemObservation(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActProblemObservation(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ProblemObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemConcernActProblemObservation(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Concern Act Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemConcernActProblemObservation(ProblemConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param problemConcernAct2 The receiving '<em><b>Problem Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProblemConcernActProblemObservation(ProblemConcernAct2 problemConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ProblemConcernAct2ProblemConcernActProblemObservation", "ERROR");

		if (VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROBLEM_CONCERN_ACT2);
			try {
				VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				problemConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROBLEM_CONCERN_ACT2__PROBLEM_CONCERN_ACT_PROBLEM_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("ProblemConcernAct2ProblemConcernActProblemObservation"),
						new Object[] { problemConcernAct2 }));
			}

			return false;
		}
		return true;
	}

} // ProblemConcernAct2Operations

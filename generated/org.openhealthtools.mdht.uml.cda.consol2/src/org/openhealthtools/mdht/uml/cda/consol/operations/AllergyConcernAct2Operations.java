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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Concern Act2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2EffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2EffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyConcernAct2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyConcernAct2#validateAllergyProblemActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllergyConcernAct2Operations extends AllergyProblemActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyConcernAct2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyConcernAct2EffectiveTimeLow(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2EffectiveTimeLow(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyConcernAct2EffectiveTimeLow(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2EffectiveTimeLow(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyConcernAct2 The receiving '<em><b>Allergy Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyConcernAct2EffectiveTimeLow(AllergyConcernAct2 allergyConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_CONCERN_ACT2);
			try {
				VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_CONCERN_ACT2__ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_LOW,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AllergyConcernAct2EffectiveTimeLow",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergyConcernAct2, context) }),
					new Object[] { allergyConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyConcernAct2EffectiveTimeHigh(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2EffectiveTimeHigh(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "true";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyConcernAct2EffectiveTimeHigh(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2EffectiveTimeHigh(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyConcernAct2 The receiving '<em><b>Allergy Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyConcernAct2EffectiveTimeHigh(AllergyConcernAct2 allergyConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_CONCERN_ACT2);
			try {
				VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_CONCERN_ACT2__ALLERGY_CONCERN_ACT2_EFFECTIVE_TIME_HIGH,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"AllergyConcernAct2EffectiveTimeHigh",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(allergyConcernAct2, context) }),
					new Object[] { allergyConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyConcernAct2AuthorParticipation(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2AuthorParticipation(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyConcernAct2AuthorParticipation(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2AuthorParticipation(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyConcernAct2 The receiving '<em><b>Allergy Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyConcernAct2AuthorParticipation(AllergyConcernAct2 allergyConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_CONCERN_ACT2);
			try {
				VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_CONCERN_ACT2__ALLERGY_CONCERN_ACT2_AUTHOR_PARTICIPATION,
					ConsolPlugin.INSTANCE.getString("AllergyConcernAct2AuthorParticipation"),
					new Object[] { allergyConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyConcernAct2IVLTSLow(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2IVLTSLow(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyConcernAct2IVLTSLow(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2IVLTSLow(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyConcernAct2 The receiving '<em><b>Allergy Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyConcernAct2IVLTSLow(AllergyConcernAct2 allergyConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_CONCERN_ACT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyConcernAct2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_CONCERN_ACT2__ALLERGY_CONCERN_ACT2_IVLTS_LOW,
						ConsolPlugin.INSTANCE.getString("AllergyConcernAct2IVLTSLow"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyConcernAct2IVLTSHigh(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2IVLTSHigh(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyConcernAct2IVLTSHigh(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Concern Act2 IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyConcernAct2IVLTSHigh(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyConcernAct2 The receiving '<em><b>Allergy Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateAllergyConcernAct2IVLTSHigh(AllergyConcernAct2 allergyConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_CONCERN_ACT2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_ALLERGY_CONCERN_ACT2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(allergyConcernAct2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.ALLERGY_CONCERN_ACT2__ALLERGY_CONCERN_ACT2_IVLTS_HIGH,
						ConsolPlugin.INSTANCE.getString("AllergyConcernAct2IVLTSHigh"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActTemplateId(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActTemplateId(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.6.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActTemplateId(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActTemplateId(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyConcernAct2 The receiving '<em><b>Allergy Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyProblemActTemplateId(AllergyConcernAct2 allergyConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_CONCERN_ACT2);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_CONCERN_ACT2__ALLERGY_PROBLEM_ACT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActTemplateId"), new Object[] { allergyConcernAct2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAllergyProblemActEffectiveTime(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActEffectiveTime(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAllergyProblemActEffectiveTime(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAllergyProblemActEffectiveTime(AllergyConcernAct2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param allergyConcernAct2 The receiving '<em><b>Allergy Concern Act2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateAllergyProblemActEffectiveTime(AllergyConcernAct2 allergyConcernAct2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ALLERGY_CONCERN_ACT2);
			try {
				VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			allergyConcernAct2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ALLERGY_CONCERN_ACT2__ALLERGY_PROBLEM_ACT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("AllergyProblemActEffectiveTime"),
					new Object[] { allergyConcernAct2 }));
			}

			return false;
		}
		return true;
	}

} // AllergyConcernAct2Operations

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tobacco Use2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUse2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUseCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUse2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUse2CDCodeTermAssertionOrLoinc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 CD Code Term Assertion Or Loinc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUse2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2#validateTobaccoUseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TobaccoUse2Operations extends TobaccoUseOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TobaccoUse2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUse2Id(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUse2Id(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUse2Id(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUse2Id(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse2 The receiving '<em><b>Tobacco Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUse2Id(TobaccoUse2 tobaccoUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TOBACCO_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE2);
			try {
				VALIDATE_TOBACCO_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_TOBACCO_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TOBACCO_USE2__TOBACCO_USE2_ID,
						ConsolPlugin.INSTANCE.getString("TobaccoUse2TobaccoUse2Id"), new Object[] { tobaccoUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse2 The receiving '<em><b>Tobacco Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUse2AuthorParticipation(TobaccoUse2 tobaccoUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TOBACCO_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE2);
			try {
				VALIDATE_TOBACCO_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_TOBACCO_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			tobaccoUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TOBACCO_USE2__TOBACCO_USE2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString("TobaccoUse2TobaccoUse2AuthorParticipation"),
						new Object[] { tobaccoUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse2 The receiving '<em><b>Tobacco Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTobaccoUse2CDCodeTermAssertionOrLoinc(TobaccoUse2 tobaccoUse2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TOBACCO_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_TOBACCO_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TOBACCO_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(
					oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TOBACCO_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(
			tobaccoUse2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.TOBACCO_USE2__TOBACCO_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC,
							ConsolPlugin.INSTANCE.getString("TobaccoUse2TobaccoUse2CDCodeTermAssertionOrLoinc"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse2 The receiving '<em><b>Tobacco Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTobaccoUse2IVLTSHigh(TobaccoUse2 tobaccoUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TOBACCO_USE2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_TOBACCO_USE2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TOBACCO_USE2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TOBACCO_USE2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(tobaccoUse2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.TOBACCO_USE2__TOBACCO_USE2_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString("TobaccoUse2TobaccoUse2IVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse2 The receiving '<em><b>Tobacco Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseTemplateId(TobaccoUse2 tobaccoUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE2);
			try {
				VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			tobaccoUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TOBACCO_USE2__TOBACCO_USE_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("TobaccoUse2TobaccoUseTemplateId"),
						new Object[] { tobaccoUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse2 The receiving '<em><b>Tobacco Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseEffectiveTime(TobaccoUse2 tobaccoUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE2);
			try {
				VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			tobaccoUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TOBACCO_USE2__TOBACCO_USE_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("TobaccoUse2TobaccoUseEffectiveTime"),
						new Object[] { tobaccoUse2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseCodeP(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCodeP(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseCodeP(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCodeP(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUse2AuthorParticipation(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUse2AuthorParticipation(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUse2AuthorParticipation(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUse2AuthorParticipation(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUse2CDCodeTermAssertionOrLoinc(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 CD Code Term Assertion Or Loinc</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUse2CDCodeTermAssertionOrLoinc(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUse2CDCodeTermAssertionOrLoinc(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 CD Code Term Assertion Or Loinc</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUse2CDCodeTermAssertionOrLoinc(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TOBACCO_USE2_CD_CODE_TERM_ASSERTION_OR_LOINC__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUse2IVLTSHigh(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUse2IVLTSHigh(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUse2IVLTSHigh(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use2 IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUse2IVLTSHigh(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TOBACCO_USE2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseTemplateId(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseTemplateId(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.85' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseTemplateId(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseTemplateId(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse2 The receiving '<em><b>Tobacco Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseCodeP(TobaccoUse2 tobaccoUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TOBACCO_USE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE2);
			try {
				VALIDATE_TOBACCO_USE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_TOBACCO_USE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TOBACCO_USE2__TOBACCO_USE_CODE_P,
						ConsolPlugin.INSTANCE.getString("TobaccoUse2TobaccoUseCodeP"), new Object[] { tobaccoUse2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.TobaccoUseCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.TobaccoUseCodeP", passToken);
				}
				passToken.add(tobaccoUse2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseCode(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCode(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '11367-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseCode(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseCode(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateTobaccoUseEffectiveTime(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseEffectiveTime(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTobaccoUseEffectiveTime(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTobaccoUseEffectiveTime(TobaccoUse2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TOBACCO_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param tobaccoUse2 The receiving '<em><b>Tobacco Use2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTobaccoUseCode(TobaccoUse2 tobaccoUse2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.TobaccoUseCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(tobaccoUse2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TOBACCO_USE2);
			try {
				VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(
					VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tobaccoUse2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TOBACCO_USE2__TOBACCO_USE_CODE,
						ConsolPlugin.INSTANCE.getString("TobaccoUse2TobaccoUseCode"), new Object[] { tobaccoUse2 }));
			}

			return false;
		}
		return true;
	}

} // TobaccoUse2Operations

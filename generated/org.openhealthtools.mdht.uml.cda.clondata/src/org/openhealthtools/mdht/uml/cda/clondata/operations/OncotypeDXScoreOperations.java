/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Oncotype DX Score</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore#validateOncotypeDXScoreCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore#validateOncotypeDXScoreCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore#validateOncotypeDXScoreStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore#validateOncotypeDXScoreStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore#validateOncotypeDXScoreValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.OncotypeDXScore#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OncotypeDXScoreOperations extends ResultObservationOperations {
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
	protected OncotypeDXScoreOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOncotypeDXScoreCodeP(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreCodeP(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONCOTYPE_DX_SCORE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOncotypeDXScoreCodeP(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreCodeP(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONCOTYPE_DX_SCORE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oncotypeDXScore The receiving '<em><b>Oncotype DX Score</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOncotypeDXScoreCodeP(OncotypeDXScore oncotypeDXScore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONCOTYPE_DX_SCORE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getOncotypeDXScore());
			try {
				VALIDATE_ONCOTYPE_DX_SCORE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONCOTYPE_DX_SCORE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONCOTYPE_DX_SCORE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			oncotypeDXScore)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OncotypeDXScoreOncotypeDXScoreCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										oncotypeDXScore, context) }),
						new Object[] { oncotypeDXScore }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOncotypeDXScoreCode(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreCode(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONCOTYPE_DX_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '56780-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOncotypeDXScoreCode(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreCode(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONCOTYPE_DX_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oncotypeDXScore The receiving '<em><b>Oncotype DX Score</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOncotypeDXScoreCode(OncotypeDXScore oncotypeDXScore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONCOTYPE_DX_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getOncotypeDXScore());
			try {
				VALIDATE_ONCOTYPE_DX_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONCOTYPE_DX_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONCOTYPE_DX_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			oncotypeDXScore)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OncotypeDXScoreOncotypeDXScoreCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										oncotypeDXScore, context) }),
						new Object[] { oncotypeDXScore }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOncotypeDXScoreStatusCodeP(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreStatusCodeP(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOncotypeDXScoreStatusCodeP(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreStatusCodeP(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oncotypeDXScore The receiving '<em><b>Oncotype DX Score</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOncotypeDXScoreStatusCodeP(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getOncotypeDXScore());
			try {
				VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oncotypeDXScore)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OncotypeDXScoreOncotypeDXScoreStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										oncotypeDXScore, context) }),
						new Object[] { oncotypeDXScore }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOncotypeDXScoreStatusCode(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreStatusCode(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateOncotypeDXScoreStatusCode(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreStatusCode(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oncotypeDXScore The receiving '<em><b>Oncotype DX Score</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOncotypeDXScoreStatusCode(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getOncotypeDXScore());
			try {
				VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ONCOTYPE_DX_SCORE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oncotypeDXScore)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OncotypeDXScoreOncotypeDXScoreStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										oncotypeDXScore, context) }),
						new Object[] { oncotypeDXScore }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOncotypeDXScoreValue(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreValue(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ONCOTYPE_DX_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOncotypeDXScoreValue(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oncotype DX Score Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOncotypeDXScoreValue(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ONCOTYPE_DX_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oncotypeDXScore The receiving '<em><b>Oncotype DX Score</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateOncotypeDXScoreValue(OncotypeDXScore oncotypeDXScore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_ONCOTYPE_DX_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getOncotypeDXScore());
			try {
				VALIDATE_ONCOTYPE_DX_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ONCOTYPE_DX_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_ONCOTYPE_DX_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			oncotypeDXScore)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ONCOTYPE_DX_SCORE__ONCOTYPE_DX_SCORE_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OncotypeDXScoreOncotypeDXScoreValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										oncotypeDXScore, context) }),
						new Object[] { oncotypeDXScore }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(OncotypeDXScore, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param oncotypeDXScore The receiving '<em><b>Oncotype DX Score</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationTemplateId(OncotypeDXScore oncotypeDXScore,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getOncotypeDXScore());
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(oncotypeDXScore)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ONCOTYPE_DX_SCORE__RESULT_OBSERVATION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"OncotypeDXScoreResultObservationTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										oncotypeDXScore, context) }),
						new Object[] { oncotypeDXScore }));
			}

			return false;
		}
		return true;
	}

} // OncotypeDXScoreOperations

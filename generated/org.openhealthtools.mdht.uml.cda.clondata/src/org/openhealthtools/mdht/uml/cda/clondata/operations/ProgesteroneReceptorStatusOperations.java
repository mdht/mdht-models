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
import org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progesterone Receptor Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus#validateProgesteroneReceptorStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus#validateProgesteroneReceptorStatusInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus#validateProgesteroneReceptorStatusInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus#validateProgesteroneReceptorStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ProgesteroneReceptorStatus#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgesteroneReceptorStatusOperations extends ResultObservationOperations {
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
	protected ProgesteroneReceptorStatusOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgesteroneReceptorStatusCode(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgesteroneReceptorStatusCode(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGESTERONE_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgesteroneReceptorStatusCode(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgesteroneReceptorStatusCode(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGESTERONE_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progesteroneReceptorStatus The receiving '<em><b>Progesterone Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgesteroneReceptorStatusCode(ProgesteroneReceptorStatus progesteroneReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROGESTERONE_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProgesteroneReceptorStatus());
			try {
				VALIDATE_PROGESTERONE_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PROGESTERONE_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGESTERONE_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progesteroneReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROGESTERONE_RECEPTOR_STATUS__PROGESTERONE_RECEPTOR_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProgesteroneReceptorStatusProgesteroneReceptorStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										progesteroneReceptorStatus, context) }),
						new Object[] { progesteroneReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progesteroneReceptorStatus The receiving '<em><b>Progesterone Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgesteroneReceptorStatusInterpretationCodeP(
			ProgesteroneReceptorStatus progesteroneReceptorStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProgesteroneReceptorStatus());
			try {
				VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progesteroneReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROGESTERONE_RECEPTOR_STATUS__PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProgesteroneReceptorStatusProgesteroneReceptorStatusInterpretationCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										progesteroneReceptorStatus, context) }),
						new Object[] { progesteroneReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgesteroneReceptorStatusInterpretationCode(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgesteroneReceptorStatusInterpretationCode(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->size() = 1 and self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = element.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.83' and (value.code = 'A' or value.code = 'HX' or value.code = 'LX' or value.code = 'B' or value.code = 'Carrier' or value.code = 'D' or value.code = 'U' or value.code = 'IND' or value.code = 'I' or value.code = 'MS' or value.code = 'NEG' or value.code = 'N' or value.code = 'POS' or value.code = 'R' or value.code = 'S' or value.code = 'VS' or value.code = 'W')))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgesteroneReceptorStatusInterpretationCode(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgesteroneReceptorStatusInterpretationCode(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateProgesteroneReceptorStatusInterpretationCodeP(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgesteroneReceptorStatusInterpretationCodeP(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgesteroneReceptorStatusInterpretationCodeP(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgesteroneReceptorStatusInterpretationCodeP(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progesteroneReceptorStatus The receiving '<em><b>Progesterone Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgesteroneReceptorStatusInterpretationCode(
			ProgesteroneReceptorStatus progesteroneReceptorStatus, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProgesteroneReceptorStatus());
			try {
				VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progesteroneReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROGESTERONE_RECEPTOR_STATUS__PROGESTERONE_RECEPTOR_STATUS_INTERPRETATION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProgesteroneReceptorStatusProgesteroneReceptorStatusInterpretationCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										progesteroneReceptorStatus, context) }),
						new Object[] { progesteroneReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgesteroneReceptorStatusValue(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgesteroneReceptorStatusValue(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGESTERONE_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgesteroneReceptorStatusValue(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progesterone Receptor Status Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgesteroneReceptorStatusValue(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_PROGESTERONE_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progesteroneReceptorStatus The receiving '<em><b>Progesterone Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateProgesteroneReceptorStatusValue(ProgesteroneReceptorStatus progesteroneReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROGESTERONE_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProgesteroneReceptorStatus());
			try {
				VALIDATE_PROGESTERONE_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PROGESTERONE_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PROGESTERONE_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progesteroneReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROGESTERONE_RECEPTOR_STATUS__PROGESTERONE_RECEPTOR_STATUS_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProgesteroneReceptorStatusProgesteroneReceptorStatusValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										progesteroneReceptorStatus, context) }),
						new Object[] { progesteroneReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(ProgesteroneReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param progesteroneReceptorStatus The receiving '<em><b>Progesterone Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationTemplateId(ProgesteroneReceptorStatus progesteroneReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getProgesteroneReceptorStatus());
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				progesteroneReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.PROGESTERONE_RECEPTOR_STATUS__RESULT_OBSERVATION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ProgesteroneReceptorStatusResultObservationTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										progesteroneReceptorStatus, context) }),
						new Object[] { progesteroneReceptorStatus }));
			}

			return false;
		}
		return true;
	}

} // ProgesteroneReceptorStatusOperations

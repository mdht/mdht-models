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
import org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Estrogen Receptor Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus#validateEstrogenReceptorStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus#validateEstrogenReceptorStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus#validateEstrogenReceptorStatusInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus#validateEstrogenReceptorStatusInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus#validateEstrogenReceptorStatusMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus#validateEstrogenReceptorStatusMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus#validateEstrogenReceptorStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.EstrogenReceptorStatus#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstrogenReceptorStatusOperations extends ResultObservationOperations {
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
	protected EstrogenReceptorStatusOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstrogenReceptorStatusCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEstrogenReceptorStatusCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estrogenReceptorStatus The receiving '<em><b>Estrogen Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstrogenReceptorStatusCodeP(EstrogenReceptorStatus estrogenReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus());
			try {
				VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estrogenReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"EstrogenReceptorStatusEstrogenReceptorStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										estrogenReceptorStatus, context) }),
						new Object[] { estrogenReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstrogenReceptorStatusCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '16112-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateEstrogenReceptorStatusCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estrogenReceptorStatus The receiving '<em><b>Estrogen Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstrogenReceptorStatusCode(EstrogenReceptorStatus estrogenReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus());
			try {
				VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTROGEN_RECEPTOR_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estrogenReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"EstrogenReceptorStatusEstrogenReceptorStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										estrogenReceptorStatus, context) }),
						new Object[] { estrogenReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estrogenReceptorStatus The receiving '<em><b>Estrogen Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstrogenReceptorStatusInterpretationCodeP(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus());
			try {
				VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estrogenReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"EstrogenReceptorStatusEstrogenReceptorStatusInterpretationCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										estrogenReceptorStatus, context) }),
						new Object[] { estrogenReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstrogenReceptorStatusInterpretationCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusInterpretationCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->size() = 1 and self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = element.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.83' and (value.code = 'A' or value.code = 'HX' or value.code = 'LX' or value.code = 'B' or value.code = 'Carrier' or value.code = 'D' or value.code = 'U' or value.code = 'IND' or value.code = 'I' or value.code = 'MS' or value.code = 'NEG' or value.code = 'N' or value.code = 'POS' or value.code = 'R' or value.code = 'S' or value.code = 'VS' or value.code = 'W')))";

	/**
	 * The cached OCL invariant for the '{@link #validateEstrogenReceptorStatusInterpretationCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusInterpretationCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateEstrogenReceptorStatusInterpretationCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusInterpretationCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateEstrogenReceptorStatusInterpretationCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusInterpretationCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estrogenReceptorStatus The receiving '<em><b>Estrogen Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstrogenReceptorStatusInterpretationCode(
			EstrogenReceptorStatus estrogenReceptorStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus());
			try {
				VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estrogenReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_INTERPRETATION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"EstrogenReceptorStatusEstrogenReceptorStatusInterpretationCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										estrogenReceptorStatus, context) }),
						new Object[] { estrogenReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstrogenReceptorStatusMethodCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusMethodCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateEstrogenReceptorStatusMethodCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusMethodCodeP(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estrogenReceptorStatus The receiving '<em><b>Estrogen Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstrogenReceptorStatusMethodCodeP(EstrogenReceptorStatus estrogenReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus());
			try {
				VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estrogenReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_METHOD_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"EstrogenReceptorStatusEstrogenReceptorStatusMethodCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										estrogenReceptorStatus, context) }),
						new Object[] { estrogenReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstrogenReceptorStatusMethodCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusMethodCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = element.oclAsType(datatypes::CE) in " +
			"value.code = '117617002' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEstrogenReceptorStatusMethodCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusMethodCode(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estrogenReceptorStatus The receiving '<em><b>Estrogen Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstrogenReceptorStatusMethodCode(EstrogenReceptorStatus estrogenReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus());
			try {
				VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTROGEN_RECEPTOR_STATUS_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estrogenReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_METHOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"EstrogenReceptorStatusEstrogenReceptorStatusMethodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										estrogenReceptorStatus, context) }),
						new Object[] { estrogenReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEstrogenReceptorStatusValue(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusValue(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ESTROGEN_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateEstrogenReceptorStatusValue(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estrogen Receptor Status Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEstrogenReceptorStatusValue(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_ESTROGEN_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estrogenReceptorStatus The receiving '<em><b>Estrogen Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateEstrogenReceptorStatusValue(EstrogenReceptorStatus estrogenReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_ESTROGEN_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus());
			try {
				VALIDATE_ESTROGEN_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_ESTROGEN_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_ESTROGEN_RECEPTOR_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estrogenReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ESTROGEN_RECEPTOR_STATUS__ESTROGEN_RECEPTOR_STATUS_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"EstrogenReceptorStatusEstrogenReceptorStatusValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										estrogenReceptorStatus, context) }),
						new Object[] { estrogenReceptorStatus }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.19')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultObservationTemplateId(EstrogenReceptorStatus, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param estrogenReceptorStatus The receiving '<em><b>Estrogen Receptor Status</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResultObservationTemplateId(EstrogenReceptorStatus estrogenReceptorStatus,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getEstrogenReceptorStatus());
			try {
				VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				estrogenReceptorStatus)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.ESTROGEN_RECEPTOR_STATUS__RESULT_OBSERVATION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"EstrogenReceptorStatusResultObservationTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										estrogenReceptorStatus, context) }),
						new Object[] { estrogenReceptorStatus }));
			}

			return false;
		}
		return true;
	}

} // EstrogenReceptorStatusOperations

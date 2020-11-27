/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Model Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation#validateModelNumberObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation#validateModelNumberObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation#validateModelNumberObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation#validateModelNumberObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelNumberObservationOperations extends ClinicalStatementOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
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
	protected ModelNumberObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateModelNumberObservationTemplateId(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateModelNumberObservationTemplateId(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MODEL_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.317' and id.extension = '2019-06-21')";

	/**
	 * The cached OCL invariant for the '{@link #validateModelNumberObservationTemplateId(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateModelNumberObservationTemplateId(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MODEL_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param modelNumberObservation The receiving '<em><b>Model Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateModelNumberObservationTemplateId(ModelNumberObservation modelNumberObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ModelNumberObservationModelNumberObservationTemplateId", "ERROR");

		if (VALIDATE_MODEL_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MODEL_NUMBER_OBSERVATION);
			try {
				VALIDATE_MODEL_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_MODEL_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MODEL_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				modelNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MODEL_NUMBER_OBSERVATION__MODEL_NUMBER_OBSERVATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ModelNumberObservationModelNumberObservationTemplateId"),
						new Object[] { modelNumberObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateModelNumberObservationCodeP(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateModelNumberObservationCodeP(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MODEL_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateModelNumberObservationCodeP(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateModelNumberObservationCodeP(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MODEL_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param modelNumberObservation The receiving '<em><b>Model Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateModelNumberObservationCodeP(ModelNumberObservation modelNumberObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ModelNumberObservationModelNumberObservationCodeP", "ERROR");

		if (VALIDATE_MODEL_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MODEL_NUMBER_OBSERVATION);
			try {
				VALIDATE_MODEL_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MODEL_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MODEL_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				modelNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MODEL_NUMBER_OBSERVATION__MODEL_NUMBER_OBSERVATION_CODE_P,
						ConsolPlugin.INSTANCE.getString("ModelNumberObservationModelNumberObservationCodeP"),
						new Object[] { modelNumberObservation }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservationCodeP", passToken);
				}
				passToken.add(modelNumberObservation);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateModelNumberObservationCode(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateModelNumberObservationCode(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MODEL_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'C99285' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateModelNumberObservationCode(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateModelNumberObservationCode(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MODEL_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param modelNumberObservation The receiving '<em><b>Model Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateModelNumberObservationCode(ModelNumberObservation modelNumberObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(modelNumberObservation)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "ModelNumberObservationModelNumberObservationCode", "ERROR");

		if (VALIDATE_MODEL_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MODEL_NUMBER_OBSERVATION);
			try {
				VALIDATE_MODEL_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MODEL_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MODEL_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				modelNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MODEL_NUMBER_OBSERVATION__MODEL_NUMBER_OBSERVATION_CODE,
						ConsolPlugin.INSTANCE.getString("ModelNumberObservationModelNumberObservationCode"),
						new Object[] { modelNumberObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateModelNumberObservationValue(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateModelNumberObservationValue(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MODEL_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::ED)))";

	/**
	 * The cached OCL invariant for the '{@link #validateModelNumberObservationValue(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateModelNumberObservationValue(ModelNumberObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_MODEL_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param modelNumberObservation The receiving '<em><b>Model Number Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateModelNumberObservationValue(ModelNumberObservation modelNumberObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ModelNumberObservationModelNumberObservationValue", "ERROR");

		if (VALIDATE_MODEL_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.MODEL_NUMBER_OBSERVATION);
			try {
				VALIDATE_MODEL_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_MODEL_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_MODEL_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				modelNumberObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.MODEL_NUMBER_OBSERVATION__MODEL_NUMBER_OBSERVATION_VALUE,
						ConsolPlugin.INSTANCE.getString("ModelNumberObservationModelNumberObservationValue"),
						new Object[] { modelNumberObservation }));
			}

			return false;
		}
		return true;
	}

} // ModelNumberObservationOperations

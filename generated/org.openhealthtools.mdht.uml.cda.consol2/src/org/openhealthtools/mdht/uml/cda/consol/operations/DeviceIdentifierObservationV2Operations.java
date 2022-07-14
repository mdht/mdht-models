/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation;
import org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Identifier Observation V2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2IIUDIissuingagency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2IIUD Iissuingagency</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2IIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2IIExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2#validateDeviceIdentifierObservationV2IIDisplayable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Displayable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceIdentifierObservationV2Operations extends ClinicalStatementOperations {

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
	protected DeviceIdentifierObservationV2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationV2TemplateId(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2TemplateId(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.304' and id.extension = '2022-06-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationV2TemplateId(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2TemplateId(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservationV2 The receiving '<em><b>Device Identifier Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDeviceIdentifierObservationV2TemplateId(
			DeviceIdentifierObservationV2 deviceIdentifierObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DeviceIdentifierObservationV2DeviceIdentifierObservationV2TemplateId", "ERROR");

		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				deviceIdentifierObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION_V2__DEVICE_IDENTIFIER_OBSERVATION_V2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString(
							"DeviceIdentifierObservationV2DeviceIdentifierObservationV2TemplateId"),
						new Object[] { deviceIdentifierObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationV2CodeP(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2CodeP(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationV2CodeP(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2CodeP(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservationV2 The receiving '<em><b>Device Identifier Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDeviceIdentifierObservationV2CodeP(
			DeviceIdentifierObservationV2 deviceIdentifierObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DeviceIdentifierObservationV2DeviceIdentifierObservationV2CodeP", "ERROR");

		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				deviceIdentifierObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION_V2__DEVICE_IDENTIFIER_OBSERVATION_V2_CODE_P,
						ConsolPlugin.INSTANCE.getString(
							"DeviceIdentifierObservationV2DeviceIdentifierObservationV2CodeP"),
						new Object[] { deviceIdentifierObservationV2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2CodeP", passToken);
				}
				passToken.add(deviceIdentifierObservationV2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationV2Code(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2Code(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = 'C101722' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationV2Code(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2Code(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservationV2 The receiving '<em><b>Device Identifier Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDeviceIdentifierObservationV2Code(
			DeviceIdentifierObservationV2 deviceIdentifierObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationV2CodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(deviceIdentifierObservationV2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "DeviceIdentifierObservationV2DeviceIdentifierObservationV2Code", "ERROR");

		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				deviceIdentifierObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION_V2__DEVICE_IDENTIFIER_OBSERVATION_V2_CODE,
						ConsolPlugin.INSTANCE.getString(
							"DeviceIdentifierObservationV2DeviceIdentifierObservationV2Code"),
						new Object[] { deviceIdentifierObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationV2Value(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2Value(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::II)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationV2Value(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2 Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2Value(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservationV2 The receiving '<em><b>Device Identifier Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDeviceIdentifierObservationV2Value(
			DeviceIdentifierObservationV2 deviceIdentifierObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DeviceIdentifierObservationV2DeviceIdentifierObservationV2Value", "ERROR");

		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				deviceIdentifierObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION_V2__DEVICE_IDENTIFIER_OBSERVATION_V2_VALUE,
						ConsolPlugin.INSTANCE.getString(
							"DeviceIdentifierObservationV2DeviceIdentifierObservationV2Value"),
						new Object[] { deviceIdentifierObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationIIUDIissuingagency(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation IIUD Iissuingagency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIUDIissuingagency(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * issue with inlined datatype ocl generation
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->exists( isNullFlavorDefined() or (  matches('root','\\\\b1.3.160\\\\b') or  matches('root','\\\\b2.16.840.1.113883.6.18\\\\b') or  matches('root','\\\\b2.16.840.1.113883.6.40\\\\b') ) )";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationV2IIUDIissuingagency(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2IIUD Iissuingagency</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2IIUDIissuingagency(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservationV2 The receiving '<em><b>Device Identifier Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDeviceIdentifierObservationV2IIUDIissuingagency(
			DeviceIdentifierObservationV2 deviceIdentifierObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DeviceIdentifierObservationV2DeviceIdentifierObservationV2IIUDIissuingagency", "null");

		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				deviceIdentifierObservationV2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION_V2__DEVICE_IDENTIFIER_OBSERVATION_V2IIUD_IISSUINGAGENCY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"DeviceIdentifierObservationV2DeviceIdentifierObservationV2IIUDIissuingagency",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										deviceIdentifierObservationV2, context) }),
						new Object[] { deviceIdentifierObservationV2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationIIRoot(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIRoot(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * issue with inlined datatype ocl generation
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( isNullFlavorDefined() or isDefined('root') )";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationV2IIRoot(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2IIRoot(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservationV2 The receiving '<em><b>Device Identifier Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDeviceIdentifierObservationV2IIRoot(
			DeviceIdentifierObservationV2 deviceIdentifierObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DeviceIdentifierObservationV2DeviceIdentifierObservationV2IIRoot", "ERROR");

		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			deviceIdentifierObservationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION_V2__DEVICE_IDENTIFIER_OBSERVATION_V2II_ROOT,
							ConsolPlugin.INSTANCE.getString(
								"DeviceIdentifierObservationV2DeviceIdentifierObservationV2IIRoot"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationIIExtension(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIExtension(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( isNullFlavorDefined() or isDefined('extension') )";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationV2IIExtension(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2IIExtension(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservationV2 The receiving '<em><b>Device Identifier Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDeviceIdentifierObservationV2IIExtension(
			DeviceIdentifierObservationV2 deviceIdentifierObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DeviceIdentifierObservationV2DeviceIdentifierObservationV2IIExtension", "WARNING");

		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			deviceIdentifierObservationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION_V2__DEVICE_IDENTIFIER_OBSERVATION_V2II_EXTENSION,
							ConsolPlugin.INSTANCE.getString(
								"DeviceIdentifierObservationV2DeviceIdentifierObservationV2IIExtension"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationV2IIDisplayable(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Displayable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2IIDisplayable(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not displayable.oclIsUndefined() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationV2IIDisplayable(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation V2II Displayable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationV2IIDisplayable(DeviceIdentifierObservationV2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservationV2 The receiving '<em><b>Device Identifier Observation V2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDeviceIdentifierObservationV2IIDisplayable(
			DeviceIdentifierObservationV2 deviceIdentifierObservationV2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DeviceIdentifierObservationV2DeviceIdentifierObservationV2IIDisplayable", "ERROR");

		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION_V2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_V2II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			deviceIdentifierObservationV2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION_V2__DEVICE_IDENTIFIER_OBSERVATION_V2II_DISPLAYABLE,
							ConsolPlugin.INSTANCE.getString(
								"DeviceIdentifierObservationV2DeviceIdentifierObservationV2IIDisplayable"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // DeviceIdentifierObservationV2Operations

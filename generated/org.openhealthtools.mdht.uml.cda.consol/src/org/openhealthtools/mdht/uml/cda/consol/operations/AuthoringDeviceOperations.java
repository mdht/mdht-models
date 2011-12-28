/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Authoring Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthoringDevice#validateConsolAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthoringDevice#validateConsolAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Authoring Device Software Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthoringDeviceOperations extends org.openhealthtools.mdht.uml.cda.operations.AuthoringDeviceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthoringDeviceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolAuthoringDeviceManufacturerModelName(AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Authoring Device Manufacturer Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolAuthoringDeviceManufacturerModelName(AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.manufacturerModelName.oclIsUndefined() or self.manufacturerModelName.isNullFlavorUndefined()) implies (not self.manufacturerModelName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolAuthoringDeviceManufacturerModelName(AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Authoring Device Manufacturer Model Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolAuthoringDeviceManufacturerModelName(AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.manufacturerModelName.oclIsUndefined() or self.manufacturerModelName.isNullFlavorUndefined()) implies (not self.manufacturerModelName.oclIsUndefined())
	 * @param authoringDevice The receiving '<em><b>Authoring Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolAuthoringDeviceManufacturerModelName(AuthoringDevice authoringDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHORING_DEVICE);
			try {
				VALIDATE_CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authoringDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.AUTHORING_DEVICE__CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME,
					ConsolPlugin.INSTANCE.getString("ConsolAuthoringDeviceManufacturerModelName"),
					new Object[] { authoringDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolAuthoringDeviceSoftwareName(AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Authoring Device Software Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolAuthoringDeviceSoftwareName(AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.softwareName.oclIsUndefined() or self.softwareName.isNullFlavorUndefined()) implies (not self.softwareName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolAuthoringDeviceSoftwareName(AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Authoring Device Software Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolAuthoringDeviceSoftwareName(AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.softwareName.oclIsUndefined() or self.softwareName.isNullFlavorUndefined()) implies (not self.softwareName.oclIsUndefined())
	 * @param authoringDevice The receiving '<em><b>Authoring Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolAuthoringDeviceSoftwareName(AuthoringDevice authoringDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.AUTHORING_DEVICE);
			try {
				VALIDATE_CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			authoringDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.AUTHORING_DEVICE__CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME,
					ConsolPlugin.INSTANCE.getString("ConsolAuthoringDeviceSoftwareName"),
					new Object[] { authoringDevice }));
			}
			return false;
		}
		return true;
	}

} // AuthoringDeviceOperations

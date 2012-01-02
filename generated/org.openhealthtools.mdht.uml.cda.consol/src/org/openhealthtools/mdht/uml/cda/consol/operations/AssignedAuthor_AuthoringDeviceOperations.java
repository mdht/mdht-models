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

import org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AuthoringDeviceOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Author Authoring Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice#validateAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice#validateAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authoring Device Software Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedAuthor_AuthoringDeviceOperations extends AuthoringDeviceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedAuthor_AuthoringDeviceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthoringDeviceManufacturerModelName(AssignedAuthor_AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authoring Device Manufacturer Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthoringDeviceManufacturerModelName(AssignedAuthor_AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.manufacturerModelName.oclIsUndefined() or self.manufacturerModelName.isNullFlavorUndefined()) implies (not self.manufacturerModelName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthoringDeviceManufacturerModelName(AssignedAuthor_AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authoring Device Manufacturer Model Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthoringDeviceManufacturerModelName(AssignedAuthor_AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.manufacturerModelName.oclIsUndefined() or self.manufacturerModelName.isNullFlavorUndefined()) implies (not self.manufacturerModelName.oclIsUndefined())
	 * @param assignedAuthor_AuthoringDevice The receiving '<em><b>Assigned Author Authoring Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAuthoringDeviceManufacturerModelName(
			AssignedAuthor_AuthoringDevice assignedAuthor_AuthoringDevice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_AUTHOR_AUTHORING_DEVICE);
			try {
				VALIDATE_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assignedAuthor_AuthoringDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSIGNED_AUTHOR_AUTHORING_DEVICE__AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME,
					ConsolPlugin.INSTANCE.getString("AuthoringDeviceManufacturerModelName"),
					new Object[] { assignedAuthor_AuthoringDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAuthoringDeviceSoftwareName(AssignedAuthor_AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authoring Device Software Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthoringDeviceSoftwareName(AssignedAuthor_AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.softwareName.oclIsUndefined() or self.softwareName.isNullFlavorUndefined()) implies (not self.softwareName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAuthoringDeviceSoftwareName(AssignedAuthor_AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authoring Device Software Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAuthoringDeviceSoftwareName(AssignedAuthor_AuthoringDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.softwareName.oclIsUndefined() or self.softwareName.isNullFlavorUndefined()) implies (not self.softwareName.oclIsUndefined())
	 * @param assignedAuthor_AuthoringDevice The receiving '<em><b>Assigned Author Authoring Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAuthoringDeviceSoftwareName(
			AssignedAuthor_AuthoringDevice assignedAuthor_AuthoringDevice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_AUTHOR_AUTHORING_DEVICE);
			try {
				VALIDATE_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			assignedAuthor_AuthoringDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSIGNED_AUTHOR_AUTHORING_DEVICE__AUTHORING_DEVICE_SOFTWARE_NAME,
					ConsolPlugin.INSTANCE.getString("AuthoringDeviceSoftwareName"),
					new Object[] { assignedAuthor_AuthoringDevice }));
			}
			return false;
		}
		return true;
	}

} // AssignedAuthor_AuthoringDeviceOperations

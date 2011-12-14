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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ScanningDevice;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AuthorOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scanning Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanningDevice#validateScanningDeviceTimeEqualsDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Time Equals Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanningDevice#validateScanningDeviceHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanningDevice#validateScanningDeviceHasAssignedAuthoringDeviceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Authoring Device Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanningDevice#validateScanningDeviceHasDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanningDevice#validateScanningDeviceHasDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ScanningDevice#validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Represented Organization Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScanningDeviceOperations extends AuthorOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScanningDeviceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Time Equals Document Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.time.value = self.getClinicalDocument().effectiveTime.value";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Time Equals Document Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.time.value = self.getClinicalDocument().effectiveTime.value
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice scanningDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SCANNING_DEVICE__SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("ScanningDeviceTimeEqualsDocumentEffectiveTime"),
					new Object[] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceHasAssignedAuthorId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthorId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceHasAssignedAuthorId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthorId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanningDeviceHasAssignedAuthorId(ScanningDevice scanningDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SCANNING_DEVICE__SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID,
					ConsolPlugin.INSTANCE.getString("ScanningDeviceHasAssignedAuthorId"),
					new Object[] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Authoring Device Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor.assignedAuthoringDevice.code.codeSystem = '1.2.840.10008.2.16.4'"
			+ "   and not self.assignedAuthor.assignedAuthoringDevice.code.code.oclIsUndefined()"
			+ "   and not self.assignedAuthor.assignedAuthoringDevice.code.displayName.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Authoring Device Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.assignedAuthoringDevice.code.codeSystem = '1.2.840.10008.2.16.4'
	 *    and not self.assignedAuthor.assignedAuthoringDevice.code.code.oclIsUndefined()
	 *    and not self.assignedAuthor.assignedAuthoringDevice.code.displayName.oclIsUndefined()
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice scanningDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SCANNING_DEVICE__SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE,
					ConsolPlugin.INSTANCE.getString("ScanningDeviceHasAssignedAuthoringDeviceCode"),
					new Object[] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceHasDeviceManufacturerModelName(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Device Manufacturer Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasDeviceManufacturerModelName(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.assignedAuthor.assignedAuthoringDevice.manufacturerModelName.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceHasDeviceManufacturerModelName(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Device Manufacturer Model Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasDeviceManufacturerModelName(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.assignedAuthor.assignedAuthoringDevice.manufacturerModelName.oclIsUndefined()
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanningDeviceHasDeviceManufacturerModelName(ScanningDevice scanningDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SCANNING_DEVICE__SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME,
					ConsolPlugin.INSTANCE.getString("ScanningDeviceHasDeviceManufacturerModelName"),
					new Object[] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceHasDeviceSoftwareName(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Device Software Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasDeviceSoftwareName(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.assignedAuthor.assignedAuthoringDevice.softwareName.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceHasDeviceSoftwareName(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Device Software Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasDeviceSoftwareName(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.assignedAuthor.assignedAuthoringDevice.softwareName.oclIsUndefined()
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanningDeviceHasDeviceSoftwareName(ScanningDevice scanningDevice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SCANNING_DEVICE__SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME,
					ConsolPlugin.INSTANCE.getString("ScanningDeviceHasDeviceSoftwareName"),
					new Object[] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Represented Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor.representedOrganization.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Represented Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.representedOrganization.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(
			ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SCANNING_DEVICE__SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID,
					ConsolPlugin.INSTANCE.getString("ScanningDeviceHasAssignedAuthorRepresentedOrganizationId"),
					new Object[] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

} // ScanningDeviceOperations

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
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ParticipantRoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Service Delivery Location</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDeliveryLocationOperations extends ParticipantRoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDeliveryLocationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceDeliveryLocationHasPlayingEntity(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationHasPlayingEntity(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingEntity->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationHasPlayingEntity(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationHasPlayingEntity(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.playingEntity->size() > 0
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceDeliveryLocationHasPlayingEntity(
			ServiceDeliveryLocation serviceDeliveryLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY,
					ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationHasPlayingEntity"),
					new Object[] { serviceDeliveryLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceDeliveryLocationHasPlayingEntityClassCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationHasPlayingEntityClassCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingEntity->size()>0 implies self.playingEntity.classCode=vocab::EntityClassRoot::PLC";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationHasPlayingEntityClassCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationHasPlayingEntityClassCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.playingEntity->size()>0 implies self.playingEntity.classCode=vocab::EntityClassRoot::PLC
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceDeliveryLocationHasPlayingEntityClassCode(
			ServiceDeliveryLocation serviceDeliveryLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationHasPlayingEntityClassCode"),
					new Object[] { serviceDeliveryLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceDeliveryLocationTemplateId(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationTemplateId(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationTemplateId(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationTemplateId(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.32')
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceDeliveryLocationTemplateId(ServiceDeliveryLocation serviceDeliveryLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationTemplateId"),
					new Object[] { serviceDeliveryLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceDeliveryLocationAddr(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationAddr(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationAddr(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationAddr(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceDeliveryLocationAddr(ServiceDeliveryLocation serviceDeliveryLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_ADDR,
					ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationAddr"),
					new Object[] { serviceDeliveryLocation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceDeliveryLocationTelecom(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationTelecom(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationTelecom(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationTelecom(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateServiceDeliveryLocationTelecom(ServiceDeliveryLocation serviceDeliveryLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_TELECOM,
					ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationTelecom"),
					new Object[] { serviceDeliveryLocation }));
			}
			return false;
		}
		return true;
	}

} // ServiceDeliveryLocationOperations

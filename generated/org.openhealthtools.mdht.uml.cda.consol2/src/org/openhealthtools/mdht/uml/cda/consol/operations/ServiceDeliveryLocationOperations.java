/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ParticipantRoleOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDeliveryLocationOperations extends ParticipantRoleOperations {
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
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingEntity->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationHasPlayingEntity(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationHasPlayingEntity(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateServiceDeliveryLocationHasPlayingEntity(
			ServiceDeliveryLocation serviceDeliveryLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ServiceDeliveryLocationServiceDeliveryLocationHasPlayingEntity", "INFO");

		if (VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY,
						ConsolPlugin.INSTANCE.getString(
							"ServiceDeliveryLocationServiceDeliveryLocationHasPlayingEntity"),
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

	protected static ThreadLocal<Constraint> VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateServiceDeliveryLocationHasPlayingEntityClassCode(
			ServiceDeliveryLocation serviceDeliveryLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "ServiceDeliveryLocationServiceDeliveryLocationHasPlayingEntityClassCode", "ERROR");

		if (VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString(
							"ServiceDeliveryLocationServiceDeliveryLocationHasPlayingEntityClassCode"),
						new Object[] { serviceDeliveryLocation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceDeliveryLocationHasPlayingEntityName(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationHasPlayingEntityName(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingEntity->size()>0 implies self.playingEntity.name->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationHasPlayingEntityName(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationHasPlayingEntityName(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateServiceDeliveryLocationHasPlayingEntityName(
			ServiceDeliveryLocation serviceDeliveryLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ServiceDeliveryLocationServiceDeliveryLocationHasPlayingEntityName", "INFO");

		if (VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_NAME,
						ConsolPlugin.INSTANCE.getString(
							"ServiceDeliveryLocationServiceDeliveryLocationHasPlayingEntityName"),
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

	protected static ThreadLocal<Constraint> VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateServiceDeliveryLocationTemplateId(ServiceDeliveryLocation serviceDeliveryLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ServiceDeliveryLocationServiceDeliveryLocationTemplateId", "ERROR");

		if (VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationServiceDeliveryLocationTemplateId"),
						new Object[] { serviceDeliveryLocation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceDeliveryLocationClassCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationClassCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::RoleClassRoot::SDLOC";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationClassCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationClassCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERVICE_DELIVERY_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateServiceDeliveryLocationClassCode(ServiceDeliveryLocation serviceDeliveryLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ServiceDeliveryLocationServiceDeliveryLocationClassCode", "ERROR");

		if (VALIDATE_SERVICE_DELIVERY_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SERVICE_DELIVERY_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationServiceDeliveryLocationClassCode"),
						new Object[] { serviceDeliveryLocation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateServiceDeliveryLocationCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SERVICE_DELIVERY_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.259' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateServiceDeliveryLocationCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateServiceDeliveryLocationCode(ServiceDeliveryLocation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SERVICE_DELIVERY_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateServiceDeliveryLocationCode(ServiceDeliveryLocation serviceDeliveryLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ServiceDeliveryLocationServiceDeliveryLocationCode", "ERROR");

		if (VALIDATE_SERVICE_DELIVERY_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERVICE_DELIVERY_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_CODE,
						ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationServiceDeliveryLocationCode"),
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

	protected static ThreadLocal<Constraint> VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateServiceDeliveryLocationAddr(ServiceDeliveryLocation serviceDeliveryLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ServiceDeliveryLocationServiceDeliveryLocationAddr", "WARNING");

		if (VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_ADDR,
						ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationServiceDeliveryLocationAddr"),
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

	protected static ThreadLocal<Constraint> VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param serviceDeliveryLocation The receiving '<em><b>Service Delivery Location</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateServiceDeliveryLocationTelecom(ServiceDeliveryLocation serviceDeliveryLocation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "ServiceDeliveryLocationServiceDeliveryLocationTelecom", "WARNING");

		if (VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SERVICE_DELIVERY_LOCATION);
			try {
				VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				serviceDeliveryLocation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SERVICE_DELIVERY_LOCATION__SERVICE_DELIVERY_LOCATION_TELECOM,
						ConsolPlugin.INSTANCE.getString("ServiceDeliveryLocationServiceDeliveryLocationTelecom"),
						new Object[] { serviceDeliveryLocation }));
			}

			return false;
		}
		return true;
	}

} // ServiceDeliveryLocationOperations

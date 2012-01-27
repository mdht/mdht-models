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
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ParticipantRoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Product Instance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceScopingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Scoping Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstancePlayingDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Playing Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstanceScopingEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Scoping Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance#validateProductInstancePlayingDeviceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Playing Device Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductInstanceOperations extends ParticipantRoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstanceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductInstanceTemplateId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceTemplateId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.37')";

	/**
	 * The cached OCL invariant for the '{@link #validateProductInstanceTemplateId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceTemplateId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.37')
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductInstanceTemplateId(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRODUCT_INSTANCE);
			try {
				VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			productInstance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProductInstanceTemplateId"), new Object[] { productInstance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductInstanceClassCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceClassCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateProductInstanceClassCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceClassCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * isDefined('classCode')
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductInstanceClassCode(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRODUCT_INSTANCE);
			try {
				VALIDATE_PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			productInstance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("ProductInstanceClassCode"), new Object[] { productInstance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductInstanceId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateProductInstanceId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductInstanceId(ProductInstance productInstance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRODUCT_INSTANCE);
			try {
				VALIDATE_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(productInstance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_ID,
					ConsolPlugin.INSTANCE.getString("ProductInstanceId"), new Object[] { productInstance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductInstanceScopingEntity(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Scoping Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceScopingEntity(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity))";

	/**
	 * The cached OCL invariant for the '{@link #validateProductInstanceScopingEntity(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Scoping Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceScopingEntity(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.scopingEntity->one(scopingEntity : cda::Entity | not scopingEntity.oclIsUndefined() and scopingEntity.oclIsKindOf(cda::Entity))
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductInstanceScopingEntity(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRODUCT_INSTANCE);
			try {
				VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			productInstance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_SCOPING_ENTITY,
					ConsolPlugin.INSTANCE.getString("ProductInstanceScopingEntity"), new Object[] { productInstance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductInstancePlayingDevice(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Playing Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstancePlayingDevice(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.playingDevice->one(playingDevice : cda::Device | not playingDevice.oclIsUndefined() and playingDevice.oclIsKindOf(cda::Device))";

	/**
	 * The cached OCL invariant for the '{@link #validateProductInstancePlayingDevice(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Playing Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstancePlayingDevice(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.playingDevice->one(playingDevice : cda::Device | not playingDevice.oclIsUndefined() and playingDevice.oclIsKindOf(cda::Device))
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductInstancePlayingDevice(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRODUCT_INSTANCE);
			try {
				VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			productInstance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_PLAYING_DEVICE,
					ConsolPlugin.INSTANCE.getString("ProductInstancePlayingDevice"), new Object[] { productInstance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductInstanceScopingEntityId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Scoping Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceScopingEntityId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.scopingEntity->exists(not oclIsUndefined()) then self.scopingEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProductInstanceScopingEntityId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Scoping Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstanceScopingEntityId(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.scopingEntity->exists(not oclIsUndefined()) then self.scopingEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductInstanceScopingEntityId(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRODUCT_INSTANCE);
			try {
				VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_INSTANCE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			productInstance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_SCOPING_ENTITY_ID,
					ConsolPlugin.INSTANCE.getString("ProductInstanceScopingEntityId"), new Object[] { productInstance }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProductInstancePlayingDeviceCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Playing Device Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstancePlayingDeviceCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.playingDevice->exists(not oclIsUndefined()) then self.playingDevice->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validateProductInstancePlayingDeviceCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Playing Device Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProductInstancePlayingDeviceCode(ProductInstance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.playingDevice->exists(not oclIsUndefined()) then self.playingDevice->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined())) else true endif
	 * @param productInstance The receiving '<em><b>Product Instance</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProductInstancePlayingDeviceCode(ProductInstance productInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRODUCT_INSTANCE);
			try {
				VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_INSTANCE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			productInstance)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRODUCT_INSTANCE__PRODUCT_INSTANCE_PLAYING_DEVICE_CODE,
					ConsolPlugin.INSTANCE.getString("ProductInstancePlayingDeviceCode"),
					new Object[] { productInstance }));
			}
			return false;
		}
		return true;
	}

} // ProductInstanceOperations

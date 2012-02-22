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
import org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AssignedEntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payer Payer Assigned Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity#validatePayerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity#validatePayerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity#validatePayerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity#validatePayerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity#validatePayerAssignedEntityPayerOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Payer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Payer_PayerAssignedEntity#validatePayerAssignedEntityPayerOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Payer Organization Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Payer_PayerAssignedEntityOperations extends AssignedEntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Payer_PayerAssignedEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerAssignedEntityId(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityId(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerAssignedEntityId(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityId(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param payer_PayerAssignedEntity The receiving '<em><b>Payer Payer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePayerAssignedEntityId(Payer_PayerAssignedEntity payer_PayerAssignedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_PAYER_ASSIGNED_ENTITY);
			try {
				VALIDATE_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payer_PayerAssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_PAYER_ASSIGNED_ENTITY__PAYER_ASSIGNED_ENTITY_ID,
						 ConsolPlugin.INSTANCE.getString("PayerAssignedEntityId"),
						 new Object [] { payer_PayerAssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerAssignedEntityCode(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityCode(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.5.110' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerAssignedEntityCode(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityCode(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.110' and not value.code.oclIsUndefined()))
	 * @param payer_PayerAssignedEntity The receiving '<em><b>Payer Payer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePayerAssignedEntityCode(Payer_PayerAssignedEntity payer_PayerAssignedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_PAYER_ASSIGNED_ENTITY);
			try {
				VALIDATE_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payer_PayerAssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_PAYER_ASSIGNED_ENTITY__PAYER_ASSIGNED_ENTITY_CODE,
						 ConsolPlugin.INSTANCE.getString("PayerAssignedEntityCode"),
						 new Object [] { payer_PayerAssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerAssignedEntityAddr(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityAddr(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerAssignedEntityAddr(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityAddr(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param payer_PayerAssignedEntity The receiving '<em><b>Payer Payer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePayerAssignedEntityAddr(Payer_PayerAssignedEntity payer_PayerAssignedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_PAYER_ASSIGNED_ENTITY);
			try {
				VALIDATE_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payer_PayerAssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_PAYER_ASSIGNED_ENTITY__PAYER_ASSIGNED_ENTITY_ADDR,
						 ConsolPlugin.INSTANCE.getString("PayerAssignedEntityAddr"),
						 new Object [] { payer_PayerAssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerAssignedEntityTelecom(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityTelecom(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerAssignedEntityTelecom(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityTelecom(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param payer_PayerAssignedEntity The receiving '<em><b>Payer Payer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePayerAssignedEntityTelecom(Payer_PayerAssignedEntity payer_PayerAssignedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_PAYER_ASSIGNED_ENTITY);
			try {
				VALIDATE_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payer_PayerAssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_PAYER_ASSIGNED_ENTITY__PAYER_ASSIGNED_ENTITY_TELECOM,
						 ConsolPlugin.INSTANCE.getString("PayerAssignedEntityTelecom"),
						 new Object [] { payer_PayerAssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerAssignedEntityPayerOrganization(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Payer Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityPayerOrganization(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization))";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerAssignedEntityPayerOrganization(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Payer Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityPayerOrganization(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(cda::Organization))
	 * @param payer_PayerAssignedEntity The receiving '<em><b>Payer Payer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePayerAssignedEntityPayerOrganization(Payer_PayerAssignedEntity payer_PayerAssignedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_PAYER_ASSIGNED_ENTITY);
			try {
				VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payer_PayerAssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_PAYER_ASSIGNED_ENTITY__PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("PayerAssignedEntityPayerOrganization"),
						 new Object [] { payer_PayerAssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePayerAssignedEntityPayerOrganizationName(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Payer Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityPayerOrganizationName(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "if self.representedOrganization->exists(not oclIsUndefined()) then self.representedOrganization->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif";

	/**
	 * The cached OCL invariant for the '{@link #validatePayerAssignedEntityPayerOrganizationName(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Assigned Entity Payer Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePayerAssignedEntityPayerOrganizationName(Payer_PayerAssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.representedOrganization->exists(not oclIsUndefined()) then self.representedOrganization->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param payer_PayerAssignedEntity The receiving '<em><b>Payer Payer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePayerAssignedEntityPayerOrganizationName(Payer_PayerAssignedEntity payer_PayerAssignedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PAYER_PAYER_ASSIGNED_ENTITY);
			try {
				VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(payer_PayerAssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PAYER_PAYER_ASSIGNED_ENTITY__PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME,
						 ConsolPlugin.INSTANCE.getString("PayerAssignedEntityPayerOrganizationName"),
						 new Object [] { payer_PayerAssignedEntity }));
			}
			return false;
		}
		return true;
	}

} // Payer_PayerAssignedEntityOperations
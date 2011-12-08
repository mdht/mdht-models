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
import org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Performer2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrg(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrgId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrgName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrgAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedurePerformer#validateProcedurePerformerAssignedEntityRepOrgTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedurePerformerOperations extends Performer2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedurePerformerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntity(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntity(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntity(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntity(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity->size() = 1
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntity(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntity"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntityId(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityId(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.id->size() >= 1";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntityId(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityId(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.id->size() >= 1
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntityId(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ID,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntityId"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntityAddr(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityAddr(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.addr->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntityAddr(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityAddr(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.addr->size() = 1
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntityAddr(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY_ADDR,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntityAddr"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntityTelecom(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityTelecom(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.telecom->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntityTelecom(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityTelecom(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.telecom->size() = 1
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntityTelecom(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY_TELECOM,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntityTelecom"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntityRepOrg(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrg(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.representedOrganization->size() <= 1";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntityRepOrg(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrg(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.representedOrganization->size() <= 1
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntityRepOrg(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntityRepOrg"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntityRepOrgId(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrgId(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.representedOrganization.id->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntityRepOrgId(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrgId(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.representedOrganization.id->size() > 0
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntityRepOrgId(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ID,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntityRepOrgId"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntityRepOrgName(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrgName(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.representedOrganization.name->size() > 0";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntityRepOrgName(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrgName(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.representedOrganization.name->size() > 0
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntityRepOrgName(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_NAME,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntityRepOrgName"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntityRepOrgAddr(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrgAddr(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.representedOrganization.addr->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntityRepOrgAddr(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrgAddr(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.representedOrganization.addr->size() = 1
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntityRepOrgAddr(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_ADDR,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntityRepOrgAddr"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProcedurePerformerAssignedEntityRepOrgTelecom(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrgTelecom(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.representedOrganization.telecom->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateProcedurePerformerAssignedEntityRepOrgTelecom(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Performer Assigned Entity Rep Org Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProcedurePerformerAssignedEntityRepOrgTelecom(ProcedurePerformer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.representedOrganization.telecom->size() = 1
	 * @param procedurePerformer The receiving '<em><b>Procedure Performer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateProcedurePerformerAssignedEntityRepOrgTelecom(ProcedurePerformer procedurePerformer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_PERFORMER);
			try {
				VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedurePerformer)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_PERFORMER__PROCEDURE_PERFORMER_ASSIGNED_ENTITY_REP_ORG_TELECOM,
					ConsolPlugin.INSTANCE.getString("ProcedurePerformerAssignedEntityRepOrgTelecom"),
					new Object[] { procedurePerformer }));
			}
			return false;
		}
		return true;
	}

} // ProcedurePerformerOperations

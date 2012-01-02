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
import org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AssignedEntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Data Enterer Assigned Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity#validateAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity#validateAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity#validateAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity#validateAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DataEnterer_AssignedEntity#validateAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Assigned Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataEnterer_AssignedEntityOperations extends AssignedEntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataEnterer_AssignedEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedEntityAddr(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityAddr(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedEntityAddr(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityAddr(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param dataEnterer_AssignedEntity The receiving '<em><b>Data Enterer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedEntityAddr(DataEnterer_AssignedEntity dataEnterer_AssignedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATA_ENTERER_ASSIGNED_ENTITY);
			try {
				VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dataEnterer_AssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DATA_ENTERER_ASSIGNED_ENTITY__ASSIGNED_ENTITY_ADDR,
					ConsolPlugin.INSTANCE.getString("AssignedEntityAddr"), new Object[] { dataEnterer_AssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedEntityCode(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityCode(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.codeSystem = '2.16.840.1.113883.6.101'))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedEntityCode(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityCode(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.101'))
	 * @param dataEnterer_AssignedEntity The receiving '<em><b>Data Enterer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedEntityCode(DataEnterer_AssignedEntity dataEnterer_AssignedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATA_ENTERER_ASSIGNED_ENTITY);
			try {
				VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dataEnterer_AssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DATA_ENTERER_ASSIGNED_ENTITY__ASSIGNED_ENTITY_CODE,
					ConsolPlugin.INSTANCE.getString("AssignedEntityCode"), new Object[] { dataEnterer_AssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedEntityId(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityId(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedEntityId(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityId(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param dataEnterer_AssignedEntity The receiving '<em><b>Data Enterer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedEntityId(DataEnterer_AssignedEntity dataEnterer_AssignedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATA_ENTERER_ASSIGNED_ENTITY);
			try {
				VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dataEnterer_AssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DATA_ENTERER_ASSIGNED_ENTITY__ASSIGNED_ENTITY_ID,
					ConsolPlugin.INSTANCE.getString("AssignedEntityId"), new Object[] { dataEnterer_AssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedEntityTelecom(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityTelecom(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedEntityTelecom(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityTelecom(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom->isEmpty() or self.telecom->exists(element | element.isNullFlavorUndefined())) implies (not self.telecom->isEmpty())
	 * @param dataEnterer_AssignedEntity The receiving '<em><b>Data Enterer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedEntityTelecom(DataEnterer_AssignedEntity dataEnterer_AssignedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATA_ENTERER_ASSIGNED_ENTITY);
			try {
				VALIDATE_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dataEnterer_AssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DATA_ENTERER_ASSIGNED_ENTITY__ASSIGNED_ENTITY_TELECOM,
					ConsolPlugin.INSTANCE.getString("AssignedEntityTelecom"),
					new Object[] { dataEnterer_AssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedEntityAssignedPerson(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityAssignedPerson(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedPerson->exists(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedEntityAssignedPerson(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityAssignedPerson(DataEnterer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedPerson->exists(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))
	 * @param dataEnterer_AssignedEntity The receiving '<em><b>Data Enterer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedEntityAssignedPerson(DataEnterer_AssignedEntity dataEnterer_AssignedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DATA_ENTERER_ASSIGNED_ENTITY);
			try {
				VALIDATE_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dataEnterer_AssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DATA_ENTERER_ASSIGNED_ENTITY__ASSIGNED_ENTITY_ASSIGNED_PERSON,
					ConsolPlugin.INSTANCE.getString("AssignedEntityAssignedPerson"),
					new Object[] { dataEnterer_AssignedEntity }));
			}
			return false;
		}
		return true;
	}

} // DataEnterer_AssignedEntityOperations

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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ResponsiblePartyOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encompassing Encounter3 Responsible Party</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty#validateResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty#validateResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounter3_ResponsiblePartyOperations extends ResponsiblePartyOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounter3_ResponsiblePartyOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsiblePartyAssignedEntityHasPersonOrOrganization(EncompassingEncounter3_ResponsibleParty, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsiblePartyAssignedEntityHasPersonOrOrganization(EncompassingEncounter3_ResponsibleParty, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.assignedEntity.assignedPerson.oclIsUndefined() or not self.assignedEntity.representedOrganization->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsiblePartyAssignedEntityHasPersonOrOrganization(EncompassingEncounter3_ResponsibleParty, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsiblePartyAssignedEntityHasPersonOrOrganization(EncompassingEncounter3_ResponsibleParty, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.assignedEntity.assignedPerson.oclIsUndefined() or not self.assignedEntity.representedOrganization->isEmpty()
	 * @param encompassingEncounter3_ResponsibleParty The receiving '<em><b>Encompassing Encounter3 Responsible Party</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResponsiblePartyAssignedEntityHasPersonOrOrganization(
			EncompassingEncounter3_ResponsibleParty encompassingEncounter3_ResponsibleParty,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY);
			try {
				VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encompassingEncounter3_ResponsibleParty)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
					ConsolPlugin.INSTANCE.getString("ResponsiblePartyAssignedEntityHasPersonOrOrganization"),
					new Object[] { encompassingEncounter3_ResponsibleParty }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponsiblePartyAssignedEntity(EncompassingEncounter3_ResponsibleParty, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsiblePartyAssignedEntity(EncompassingEncounter3_ResponsibleParty, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponsiblePartyAssignedEntity(EncompassingEncounter3_ResponsibleParty, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponsiblePartyAssignedEntity(EncompassingEncounter3_ResponsibleParty, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role))
	 * @param encompassingEncounter3_ResponsibleParty The receiving '<em><b>Encompassing Encounter3 Responsible Party</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateResponsiblePartyAssignedEntity(
			EncompassingEncounter3_ResponsibleParty encompassingEncounter3_ResponsibleParty,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY);
			try {
				VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encompassingEncounter3_ResponsibleParty)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
					ConsolPlugin.INSTANCE.getString("ResponsiblePartyAssignedEntity"),
					new Object[] { encompassingEncounter3_ResponsibleParty }));
			}
			return false;
		}
		return true;
	}

} // EncompassingEncounter3_ResponsiblePartyOperations

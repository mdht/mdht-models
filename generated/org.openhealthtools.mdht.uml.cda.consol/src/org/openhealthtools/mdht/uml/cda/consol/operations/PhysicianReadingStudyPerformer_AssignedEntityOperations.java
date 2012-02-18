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
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.AssignedEntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physician Reading Study Performer Assigned Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity#validateAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity#validateAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicianReadingStudyPerformer_AssignedEntityOperations extends AssignedEntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianReadingStudyPerformer_AssignedEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedEntityCode(PhysicianReadingStudyPerformer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityCode(PhysicianReadingStudyPerformer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedEntityCode(PhysicianReadingStudyPerformer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityCode(PhysicianReadingStudyPerformer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	 * @param physicianReadingStudyPerformer_AssignedEntity The receiving '<em><b>Physician Reading Study Performer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedEntityCode(
			PhysicianReadingStudyPerformer_AssignedEntity physicianReadingStudyPerformer_AssignedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY);
			try {
				VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicianReadingStudyPerformer_AssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__ASSIGNED_ENTITY_CODE,
						 ConsolPlugin.INSTANCE.getString("AssignedEntityCode"),
						 new Object [] { physicianReadingStudyPerformer_AssignedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedEntityId(PhysicianReadingStudyPerformer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityId(PhysicianReadingStudyPerformer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedEntityId(PhysicianReadingStudyPerformer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedEntityId(PhysicianReadingStudyPerformer_AssignedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param physicianReadingStudyPerformer_AssignedEntity The receiving '<em><b>Physician Reading Study Performer Assigned Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedEntityId(
			PhysicianReadingStudyPerformer_AssignedEntity physicianReadingStudyPerformer_AssignedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY);
			try {
				VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(physicianReadingStudyPerformer_AssignedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__ASSIGNED_ENTITY_ID,
						 ConsolPlugin.INSTANCE.getString("AssignedEntityId"),
						 new Object [] { physicianReadingStudyPerformer_AssignedEntity }));
			}
			return false;
		}
		return true;
	}

} // PhysicianReadingStudyPerformer_AssignedEntityOperations

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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Informant;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Informant12Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints Informant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Informant#validateInformantHasAssignedEntityOrRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Informant Has Assigned Entity Or Related Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralHeaderConstraints_InformantOperations extends Informant12Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralHeaderConstraints_InformantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints_Informant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Informant Has Assigned Entity Or Related Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints_Informant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints_Informant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Informant Has Assigned Entity Or Related Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformantHasAssignedEntityOrRelatedEntity(GeneralHeaderConstraints_Informant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity.oclIsUndefined() xor self.relatedEntity.oclIsUndefined()
	 * @param generalHeaderConstraints_Informant The receiving '<em><b>General Header Constraints Informant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInformantHasAssignedEntityOrRelatedEntity(
			GeneralHeaderConstraints_Informant generalHeaderConstraints_Informant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.GENERAL_HEADER_CONSTRAINTS_INFORMANT);
			try {
				VALIDATE_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(generalHeaderConstraints_Informant)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.GENERAL_HEADER_CONSTRAINTS_INFORMANT__INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY,
						 ConsolPlugin.INSTANCE.getString("InformantHasAssignedEntityOrRelatedEntity"),
						 new Object [] { generalHeaderConstraints_Informant }));
			}
			return false;
		}
		return true;
	}

} // GeneralHeaderConstraints_InformantOperations

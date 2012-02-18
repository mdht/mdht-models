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

import org.openhealthtools.mdht.uml.cda.consol.AssignedEntity_AssignedPerson;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.PersonOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Entity Assigned Person</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedEntity_AssignedPerson#validateAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Person Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignedEntity_AssignedPersonOperations extends PersonOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedEntity_AssignedPersonOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssignedPersonName(AssignedEntity_AssignedPerson, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedPersonName(AssignedEntity_AssignedPerson, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssignedPersonName(AssignedEntity_AssignedPerson, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssignedPersonName(AssignedEntity_AssignedPerson, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (not self.name->isEmpty())
	 * @param assignedEntity_AssignedPerson The receiving '<em><b>Assigned Entity Assigned Person</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateAssignedPersonName(AssignedEntity_AssignedPerson assignedEntity_AssignedPerson,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSIGNED_ENTITY_ASSIGNED_PERSON);
			try {
				VALIDATE_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assignedEntity_AssignedPerson)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ASSIGNED_ENTITY_ASSIGNED_PERSON__ASSIGNED_PERSON_NAME,
						 ConsolPlugin.INSTANCE.getString("AssignedPersonName"),
						 new Object [] { assignedEntity_AssignedPerson }));
			}
			return false;
		}
		return true;
	}

} // AssignedEntity_AssignedPersonOperations

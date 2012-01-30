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

import org.openhealthtools.mdht.uml.cda.consol.AssociatedEntity_Person;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.PersonOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Associated Entity Person</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssociatedEntity_Person#validatePersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Person Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociatedEntity_PersonOperations extends PersonOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociatedEntity_PersonOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePersonName(AssociatedEntity_Person, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonName(AssociatedEntity_Person, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validatePersonName(AssociatedEntity_Person, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePersonName(AssociatedEntity_Person, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() = 1)
	 * @param associatedEntity_Person The receiving '<em><b>Associated Entity Person</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePersonName(AssociatedEntity_Person associatedEntity_Person,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ASSOCIATED_ENTITY_PERSON);
			try {
				VALIDATE_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(associatedEntity_Person)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ASSOCIATED_ENTITY_PERSON__PERSON_NAME,
					ConsolPlugin.INSTANCE.getString("PersonName"), new Object[] { associatedEntity_Person }));
			}
			return false;
		}
		return true;
	}

} // AssociatedEntity_PersonOperations

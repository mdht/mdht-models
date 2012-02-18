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
import org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Informant Related Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity#validateRelatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Informant_RelatedEntity#validateRelatedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Entity Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Informant_RelatedEntityOperations extends RoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Informant_RelatedEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedEntityAddr(Informant_RelatedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedEntityAddr(Informant_RelatedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedEntityAddr(Informant_RelatedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedEntityAddr(Informant_RelatedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr->isEmpty() or self.addr->exists(element | element.isNullFlavorUndefined())) implies (not self.addr->isEmpty())
	 * @param informant_RelatedEntity The receiving '<em><b>Informant Related Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRelatedEntityAddr(Informant_RelatedEntity informant_RelatedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INFORMANT_RELATED_ENTITY);
			try {
				VALIDATE_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RELATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(informant_RelatedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INFORMANT_RELATED_ENTITY__RELATED_ENTITY_ADDR,
						 ConsolPlugin.INSTANCE.getString("RelatedEntityAddr"),
						 new Object [] { informant_RelatedEntity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRelatedEntityPerson(Informant_RelatedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Entity Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedEntityPerson(Informant_RelatedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person))";

	/**
	 * The cached OCL invariant for the '{@link #validateRelatedEntityPerson(Informant_RelatedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Related Entity Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRelatedEntityPerson(Informant_RelatedEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person))
	 * @param informant_RelatedEntity The receiving '<em><b>Informant Related Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateRelatedEntityPerson(Informant_RelatedEntity informant_RelatedEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INFORMANT_RELATED_ENTITY);
			try {
				VALIDATE_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RELATED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(informant_RelatedEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INFORMANT_RELATED_ENTITY__RELATED_ENTITY_PERSON,
						 ConsolPlugin.INSTANCE.getString("RelatedEntityPerson"),
						 new Object [] { informant_RelatedEntity }));
			}
			return false;
		}
		return true;
	}

} // Informant_RelatedEntityOperations

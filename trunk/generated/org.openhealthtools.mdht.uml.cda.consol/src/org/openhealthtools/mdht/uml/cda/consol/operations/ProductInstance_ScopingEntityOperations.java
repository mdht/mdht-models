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
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance_ScopingEntity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.EntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Product Instance Scoping Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance_ScopingEntity#validateScopingEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductInstance_ScopingEntityOperations extends EntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductInstance_ScopingEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScopingEntityId(ProductInstance_ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScopingEntityId(ProductInstance_ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateScopingEntityId(ProductInstance_ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScopingEntityId(ProductInstance_ScopingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param productInstance_ScopingEntity The receiving '<em><b>Product Instance Scoping Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateScopingEntityId(ProductInstance_ScopingEntity productInstance_ScopingEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PRODUCT_INSTANCE_SCOPING_ENTITY);
			try {
				VALIDATE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			productInstance_ScopingEntity)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PRODUCT_INSTANCE_SCOPING_ENTITY__SCOPING_ENTITY_ID,
					ConsolPlugin.INSTANCE.getString("ScopingEntityId"), new Object[] { productInstance_ScopingEntity }));
			}
			return false;
		}
		return true;
	}

} // ProductInstance_ScopingEntityOperations

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
import org.openhealthtools.mdht.uml.cda.consol.CoverageRole_CoveragePlayingEntity;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.PlayingEntityOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coverage Role Coverage Playing Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CoverageRole_CoveragePlayingEntity#validateCoveragePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Playing Entity Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoverageRole_CoveragePlayingEntityOperations extends PlayingEntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageRole_CoveragePlayingEntityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCoveragePlayingEntityName(CoverageRole_CoveragePlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Playing Entity Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoveragePlayingEntityName(CoverageRole_CoveragePlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateCoveragePlayingEntityName(CoverageRole_CoveragePlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coverage Playing Entity Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCoveragePlayingEntityName(CoverageRole_CoveragePlayingEntity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name->isEmpty() or self.name->exists(element | element.isNullFlavorUndefined())) implies (self.name->size() = 1)
	 * @param coverageRole_CoveragePlayingEntity The receiving '<em><b>Coverage Role Coverage Playing Entity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateCoveragePlayingEntityName(CoverageRole_CoveragePlayingEntity coverageRole_CoveragePlayingEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY);
			try {
				VALIDATE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_COVERAGE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coverageRole_CoveragePlayingEntity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.COVERAGE_ROLE_COVERAGE_PLAYING_ENTITY__COVERAGE_PLAYING_ENTITY_NAME,
						 ConsolPlugin.INSTANCE.getString("CoveragePlayingEntityName"),
						 new Object [] { coverageRole_CoveragePlayingEntity }));
			}
			return false;
		}
		return true;
	}

} // CoverageRole_CoveragePlayingEntityOperations
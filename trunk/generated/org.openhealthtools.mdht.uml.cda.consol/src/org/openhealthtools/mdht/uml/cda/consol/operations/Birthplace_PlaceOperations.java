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

import org.openhealthtools.mdht.uml.cda.consol.Birthplace_Place;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.PlaceOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birthplace Place</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Birthplace_Place#validatePlaceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Place Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Birthplace_PlaceOperations extends PlaceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Birthplace_PlaceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlaceAddr(Birthplace_Place, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Place Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlaceAddr(Birthplace_Place, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.addr.oclIsUndefined() or self.addr.isNullFlavorUndefined()) implies (not self.addr.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlaceAddr(Birthplace_Place, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Place Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlaceAddr(Birthplace_Place, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr.oclIsUndefined() or self.addr.isNullFlavorUndefined()) implies (not self.addr.oclIsUndefined())
	 * @param birthplace_Place The receiving '<em><b>Birthplace Place</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePlaceAddr(Birthplace_Place birthplace_Place, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.BIRTHPLACE_PLACE);
			try {
				VALIDATE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLACE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(birthplace_Place)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE, ConsolValidator.BIRTHPLACE_PLACE__PLACE_ADDR,
					ConsolPlugin.INSTANCE.getString("PlaceAddr"), new Object[] { birthplace_Place }));
			}
			return false;
		}
		return true;
	}

} // Birthplace_PlaceOperations

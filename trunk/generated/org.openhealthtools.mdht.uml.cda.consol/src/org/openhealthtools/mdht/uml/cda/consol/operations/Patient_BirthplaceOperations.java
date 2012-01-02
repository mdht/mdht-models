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
import org.openhealthtools.mdht.uml.cda.consol.Patient_Birthplace;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.BirthplaceOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Birthplace</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Birthplace#validateBirthplacePlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birthplace Place</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Patient_BirthplaceOperations extends BirthplaceOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Patient_BirthplaceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateBirthplacePlace(Patient_Birthplace, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birthplace Place</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthplacePlace(Patient_Birthplace, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place))";

	/**
	 * The cached OCL invariant for the '{@link #validateBirthplacePlace(Patient_Birthplace, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birthplace Place</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateBirthplacePlace(Patient_Birthplace, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place))
	 * @param patient_Birthplace The receiving '<em><b>Patient Birthplace</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateBirthplacePlace(Patient_Birthplace patient_Birthplace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PATIENT_BIRTHPLACE);
			try {
				VALIDATE_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_BIRTHPLACE_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patient_Birthplace)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PATIENT_BIRTHPLACE__BIRTHPLACE_PLACE,
					ConsolPlugin.INSTANCE.getString("BirthplacePlace"), new Object[] { patient_Birthplace }));
			}
			return false;
		}
		return true;
	}

} // Patient_BirthplaceOperations

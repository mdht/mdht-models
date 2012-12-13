/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.EntryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Derived Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry#validateDerivedEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry#validateDerivedEntryTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Entry Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedEntryOperations extends EntryOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DerivedEntryOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateDerivedEntryTemplateId(DerivedEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Entry Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDerivedEntryTemplateId(DerivedEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DERIVED_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.24')";

	/**
	* The cached OCL invariant for the '{@link #validateDerivedEntryTemplateId(DerivedEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Entry Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDerivedEntryTemplateId(DerivedEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DERIVED_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param derivedEntry The receiving '<em><b>Derived Entry</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDerivedEntryTemplateId(DerivedEntry derivedEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DERIVED_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DERIVED_ENTRY);
			try {
				VALIDATE_DERIVED_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DERIVED_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DERIVED_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			derivedEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DERIVED_ENTRY__DERIVED_ENTRY_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("DerivedEntryTemplateId"), new Object[] { derivedEntry }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDerivedEntryTypeCode(DerivedEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Entry Type Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDerivedEntryTypeCode(DerivedEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DERIVED_ENTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode') and self.typeCode=vocab::x_ActRelationshipEntry::DRIV";

	/**
	* The cached OCL invariant for the '{@link #validateDerivedEntryTypeCode(DerivedEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Entry Type Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDerivedEntryTypeCode(DerivedEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DERIVED_ENTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param derivedEntry The receiving '<em><b>Derived Entry</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDerivedEntryTypeCode(DerivedEntry derivedEntry, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DERIVED_ENTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DERIVED_ENTRY);
			try {
				VALIDATE_DERIVED_ENTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DERIVED_ENTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DERIVED_ENTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(derivedEntry)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DERIVED_ENTRY__DERIVED_ENTRY_TYPE_CODE,
					EmspcrPlugin.INSTANCE.getString("DerivedEntryTypeCode"), new Object[] { derivedEntry }));
			}

			return false;
		}
		return true;
	}

} // DerivedEntryOperations

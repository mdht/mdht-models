/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPackage;
import org.openhealthtools.mdht.uml.cda.apitest.APITestPlugin;
import org.openhealthtools.mdht.uml.cda.apitest.Condition_TreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider;
import org.openhealthtools.mdht.uml.cda.apitest.util.APITestValidator;
import org.openhealthtools.mdht.uml.cda.operations.AssignedEntityOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition Treating Provider</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider#toCDAType() <em>To CDA Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider#getTreatingProviderIDs() <em>Get Treating Provider IDs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.domain.ITreatingProvider#addTreatingProviderID(org.openhealthtools.mdht.uml.hl7.datatypes.II) <em>Add Treating Provider ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.apitest.Condition_TreatingProvider#validateTreatingProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treating Provider Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Condition_TreatingProviderOperations extends AssignedEntityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Condition_TreatingProviderOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static  AssignedEntity toCDAType(Condition_TreatingProvider condition_TreatingProvider) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::AssignedEntity::id.
	 * This identifier SHALL be the identifier of one of the providers listed in the healthcare providers module.
	 * @param condition_TreatingProvider The receiving '<em><b>Condition Treating Provider</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<II> getTreatingProviderIDs(Condition_TreatingProvider condition_TreatingProvider) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain at least one [1..*] <tt><b>id</b></tt> (C83-[DE-7.05-CDA-2]).
	 * @param condition_TreatingProvider The receiving '<em><b>Condition Treating Provider</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ITreatingProvider addTreatingProviderID(Condition_TreatingProvider condition_TreatingProvider, II value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTreatingProviderId(Condition_TreatingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treating Provider Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatingProviderId(Condition_TreatingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TREATING_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateTreatingProviderId(Condition_TreatingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treating Provider Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTreatingProviderId(Condition_TreatingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_TREATING_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param condition_TreatingProvider The receiving '<em><b>Condition Treating Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateTreatingProviderId(Condition_TreatingProvider condition_TreatingProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_TREATING_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(APITestPackage.Literals.CONDITION_TREATING_PROVIDER);
			try {
				VALIDATE_TREATING_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TREATING_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TREATING_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(condition_TreatingProvider)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 APITestValidator.DIAGNOSTIC_SOURCE,
						 APITestValidator.CONDITION_TREATING_PROVIDER__TREATING_PROVIDER_ID,
						 APITestPlugin.INSTANCE.getString("TreatingProviderId"),
						 new Object [] { condition_TreatingProvider }));
			}
			return false;
		}
		return true;
	}

} // Condition_TreatingProviderOperations
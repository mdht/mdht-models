/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Entry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage#getDerivedEntry()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='DerivedEntryTemplateId DerivedEntryTypeCode' templateId.root='2.16.840.1.1133883.17.3.10.1.24' typeCode='DRIV'"
 * @generated
 */
public interface DerivedEntry extends Entry {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.1133883.17.3.10.1.24\')'"
	* @generated
	*/
	boolean validateDerivedEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'typeCode\') and self.typeCode=vocab::x_ActRelationshipEntry::DRIV'"
	* @generated
	*/
	boolean validateDerivedEntryTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public DerivedEntry init();

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedEntry init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // DerivedEntry

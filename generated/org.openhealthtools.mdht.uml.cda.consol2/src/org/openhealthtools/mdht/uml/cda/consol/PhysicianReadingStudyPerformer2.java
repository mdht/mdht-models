/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physician Reading Study Performer2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPhysicianReadingStudyPerformer2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='PhysicianReadingStudyPerformer2TemplateId' templateId.root='2.16.840.1.113883.10.20.6.2.1' templateId.extension='2014-06-09'"
 * @generated
 */
public interface PhysicianReadingStudyPerformer2 extends PhysicianReadingStudyPerformer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.6.2.1\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validatePhysicianReadingStudyPerformer2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianReadingStudyPerformer2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicianReadingStudyPerformer2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // PhysicianReadingStudyPerformer2
